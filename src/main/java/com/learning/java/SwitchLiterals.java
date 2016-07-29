package com.learning.java;

/**
 * Created by Jacek Cislo (jacek.cislo@nokia.com)
 */
public class SwitchLiterals {

    public static void testSwitch(String word) {
        switch (word) {
        case "1":
            System.out.println(1_00);
            break;
        case "2":
            System.out.println(2__00.0_1);
            break;
        case "binary":
            System.out.println(0b11111111);
            break;
        case "hexa":
            System.out.println(0xFF);
            break;
        case "floating":
            System.out.println(1.234e2);
        }
    }

    public static void main(String[] args) {
        testSwitch("1");
        testSwitch("2");
        testSwitch("binary");
        testSwitch("hexa");
        testSwitch("floating");
    }
}
