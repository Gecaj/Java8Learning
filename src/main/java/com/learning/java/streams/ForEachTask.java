package com.learning.java.streams;

import org.assertj.core.util.Lists;

import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

import static java.util.PrimitiveIterator.*;

/**
 * Created by cislo on 10/7/16.
 */
public class ForEachTask {

    public static void main(String[] args) {
        List<Person> list = Lists.newArrayList(new Person(), new Person(), new Person());
        IntStream.range(0, list.size()).forEach(i -> list.get(i).id = i);
        System.out.println(list);


    }

    static class Person {
        int id;

        @Override
        public String toString() {
            return "" + id;
        }
    }
}
