package com.learning.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Jacek Cislo (jacek.cislo@nokia.com)
 */
public class ExecutorServiceMain {

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing inventory"));
            service.execute(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Printing: " + i);
                }
            });
            service.execute(() -> System.out.println("Printing inventory"));
            Future<?> submit = service.submit(() -> System.out.println("Submitted task!"));
            System.out.println("end");
        } finally {
            if (service != null) service.shutdown();
        }


    }
}
