package com.learning.java.streams;

import java.util.*;

/**
 * Created by cislo on 10/3/16.
 */
public class Reduce {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 47, 33, 23);

        int max = ls.stream().reduce(Integer.MIN_VALUE, (a, b)-> a>b?a:b);
        System.out.println(max);
    }
}
