package com.learning.java.streams;

import java.util.*;

/**
 * Created by cislo on 10/19/16.
 */
public class FindAny {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Paul", "Pascal");
        Optional<String> ops = names.stream().findAny();
        System.out.println(ops.get());
    }
}
