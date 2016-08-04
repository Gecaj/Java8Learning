package com.learning.java;

import java.sql.Time;

/**
 * Created by Jacek Cislo (jacek.cislo@nokia.com)
 */
public class NewInterfaces {

    public static void main(String[] args) {
        TimeClient tc = new TimeClient() {};
        tc.printCurrentTime();
        CustomTimeClient custom = () -> {
            System.out.println("12345");
        };
        custom.printCurrentTime();
        TimeClient tc2 = (CustomTimeClient)() -> {
            System.out.println("12345");
        };
        tc2.printCurrentTime();
    }

    static interface TimeClient {
        default void printCurrentTime() {
            System.out.println(System.currentTimeMillis());
        }
    }

    static interface CustomTimeClient extends TimeClient{
        void printCurrentTime();

    }
}
