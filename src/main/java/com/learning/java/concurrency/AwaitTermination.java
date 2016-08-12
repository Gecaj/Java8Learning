package com.learning.java.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jacek Cislo (jacek.cislo@nokia.com)
 */
public class AwaitTermination {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            // Add tasks to the thread executor
            service.submit(createTask(0.5, "First task"));
            service.submit(createTask(0.4, "Second task"));
            service.submit(createTask(0.6, "Third task"));
            service.submit(createTask(0.8, "Fourth task"));
        } finally {
            if(service != null) service.shutdown();
        }
        if(service != null) {
            service.awaitTermination(2, TimeUnit.SECONDS);
            // Check whether all tasks are finished
            if(service.isTerminated())
                System.out.println("All tasks finished");
            else
                System.out.println("At least one task is still running");
        }
    }

    static Callable createTask(double secondsDuration, String message) {
        return () -> {
            Thread.sleep((long) (secondsDuration * 1000));
            System.out.println(message);
            return null;
        };
    }
}
