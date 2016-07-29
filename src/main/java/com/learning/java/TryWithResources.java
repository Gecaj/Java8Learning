package com.learning.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by Jacek Cislo (jacek.cislo@nokia.com)
 */
public class TryWithResources {

    private static void readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            System.out.println(br.readLine());
            throw new IllegalStateException("my exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("And finally block...");
        }
    }

    private static void readFirstLineFromFileWithFinallyBlock(String path)
            throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            System.out.println(br.readLine());
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

    private static String getFilePathFromResources(String fileName) {
        return TryWithResources.class.getClassLoader().getResource(fileName).getFile();
    }

    private static void writeToFileZipFileContents(String zipFile, String outputPath) throws IOException {
        System.out.println("outputFile = " + outputPath);
        try (ZipFile zf = new ZipFile(zipFile); BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath)
                , StandardCharsets.UTF_8)) {
            for(Enumeration entries = zf.entries(); entries.hasMoreElements();) {
                String lineSeparator = System.getProperty("line.separator");
                String zipEntryName = ((ZipEntry)entries.nextElement()).getName() + lineSeparator;
                writer.write(zipEntryName);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String path = getFilePathFromResources("test.txt");
        String zipPath = getFilePathFromResources("test.zip");
        readFirstLineFromFile(path);
        readFirstLineFromFileWithFinallyBlock(path);
        String outputPath = System.getProperty("user.dir") + "/src/main/resources/zip_output.txt";
        writeToFileZipFileContents(zipPath, outputPath);
    }
}
