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

        // Only way to call static method from interface
        System.out.println(TimeClient.currentTime());
    }

    static interface TimeClient {
        default void printCurrentTime() {
            System.out.println(currentTime());
        }

        static long currentTime() {
            return System.currentTimeMillis();
        }
    }

    interface CustomTimeClient extends TimeClient{
        void printCurrentTime();

    }

}
