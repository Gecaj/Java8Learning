package com.learning.java;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.SYNC;

public class TestClass {

    public static void main(String args[]) throws Exception {
        Path writeFile = Paths.get("src/main/resources/test.txt");
        BufferedWriter br = Files.newBufferedWriter(writeFile,
                Charset.forName("UTF-8"),
                new OpenOption[]{APPEND, SYNC});
        br.write("\nThis text file is created using Path API");
        br.flush();
        br.close();

    }
}