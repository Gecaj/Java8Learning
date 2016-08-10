package com.learning.java.concurrency;

/**
 * Created by Jacek Cislo (jacek.cislo@nokia.com)
 */
public class Concurrency {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("hello")).start();
    }
}
