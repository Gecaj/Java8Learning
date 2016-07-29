package com.learning.java;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

/**
 * Created by Jacek Cislo (jacek.cislo@nokia.com)
 */
@RunWith(MockitoJUnitRunner.class)
public class TryWithResourcesTest {

    @Mock
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws IOException {
        when(bufferedReader.readLine()).thenThrow(new IOException("From readLine"));
        doThrow(new IOException("From close")).when(bufferedReader).close();
    }

    @Test
    public void shouldSuppressExceptionFromFinallyBlock() throws IOException {
        // when
        try {
            try (BufferedReader bf = bufferedReader) {
                bf.readLine();
            }
        } catch (IOException e) {
            assertThat(e.getMessage()).isEqualTo("From readLine");
            assertThat(e.getSuppressed().length).isEqualTo(1);
            assertThat(e.getSuppressed()[0].getMessage()).isEqualTo("From close");
        }
    }

    @Test
    public void shouldSuppressExceptionFromTryBlock() throws IOException {
        // when
        try {
            try {
                bufferedReader.readLine();
            } catch (IOException e) {
                throw new IllegalStateException("asdf");
            } finally {
                bufferedReader.close();
            }
        } catch (IOException e) {
            assertThat(e.getMessage()).isEqualTo("From close");
            assertThat(e.getSuppressed().length).isZero();
        }
    }
}
