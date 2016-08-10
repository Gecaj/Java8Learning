package com.learning.java.concurrency;

/**
 * Created by Jacek Cislo (jacek.cislo@nokia.com)
 */
public class Threads {

    static class PrintData implements Runnable {
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Record: " + i);
            }
        }
    }

    static class ReadInventoryThread extends Thread {
        @Override
        public void run() {
            System.out.println("Printing inventory");
        }
    }

    public static void main(String[] args) {
        System.out.println("begin");
        new ReadInventoryThread().start();
        new Thread(new PrintData()).start();
        new ReadInventoryThread().start();
        System.out.println("end");
    }
}
