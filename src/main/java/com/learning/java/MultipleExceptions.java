package com.learning.java;

/**
 * Created by jcislo on 30.07.16.
 */

/**
 * http://docs.oracle.com/javase/7/docs/technotes/guides/language/catch-multiple.html
 */
public class MultipleExceptions {

    public static void main(String[] args) {
        handleMultipleException();
        handleSingleException();
        try {
            rethrowException("First");
        } catch (FirstException |SecondException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

    static void handleMultipleException() {
        try {
            System.out.println("From multicatch exception block");
            throw new IllegalStateException("Exception");
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
//             e is final, below doesn't compile
//             e = new IllegalArgumentException();
        }
    }

    static void handleSingleException() {
        try {
            System.out.println("From single catch exception block");
            throw new IllegalStateException("Exception");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            e = new IllegalStateException();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e = new IllegalArgumentException();
        }
    }

    // Prior to java 7, throws clause could only have Exception class
    static void rethrowException(String exceptionName) throws FirstException, SecondException {
        try {
            if (exceptionName.equals("First")) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e) {
//            when below uncommented, method can only have throws Exception
//            e = new FirstException();
            throw e;
        }
    }

    static class FirstException extends Exception { }
    static class SecondException extends Exception { }

}

