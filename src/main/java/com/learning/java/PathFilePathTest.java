package com.learning.java;

import java.nio.file.*;

public class PathFilePathTest {
    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("Root is: " + path.getRoot());
        System.out.println(path.isAbsolute());
        System.out.println(path.toAbsolutePath());

        Path currentParent = path;
        while ((currentParent = currentParent.getParent()) != null) {
            System.out.println("Current parent is:"+currentParent);
        }

    }

    public static void main(String[] args) {
        printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
        System.out.println();
        printPathInformation(Paths.get("zoo/armadillo/shells.txt"));
    }
}