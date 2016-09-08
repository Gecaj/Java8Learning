package com.learning.java.concurrency;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by cislo on 9/8/16.
 */
public class CopyOnWrite {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
        for(Integer item: list) {
            System.out.print(item+" ");
            list.add(9);
        }
        System.out.println();
        System.out.println("Size: "+list.size());
    }
}
