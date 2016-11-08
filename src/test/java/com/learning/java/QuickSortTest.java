package com.learning.java;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuickSortTest {

    private QuickSort quickSort = new QuickSort();

    @Test
    public void shouldSortQuick() {
        assertSortedCorrectly(arr(), arr());
        assertSortedCorrectly(arr(1), arr(1));
        assertSortedCorrectly(arr(2, 1), arr(1, 2));
        assertSortedCorrectly(arr(2, 1, 9, 8, 5, 13, 7, 24), arr(1, 2, 5, 7, 8, 9, 13, 24));
    }

    private int[] arr(int... ints) {
        return ints;
    }

    private void assertSortedCorrectly(int[] input, int[] expectedResult) {
        quickSort.sort(input);
        assertThat(input).isEqualTo(expectedResult);
    }
}
