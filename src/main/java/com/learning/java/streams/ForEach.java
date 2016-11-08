package com.learning.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by cislo on 9/22/16.
 */
public class ForEach {

    public static void main(String[] args) {
        Stream<Integer> integers = Stream.iterate(1, n -> n + 1);
        integers.limit(20).filter(x -> { System.out.println("filtering");return x%2==1;})
                .peek(x -> System.out.println("peek" + x)).forEach(System.out::println);

        Stream<Book> generate = Stream.generate(Book::new);
        generate.limit(3).forEach(Book::print);
    }

    static class Book {
        void print(){
            System.out.println("print");
        }
    }

}


