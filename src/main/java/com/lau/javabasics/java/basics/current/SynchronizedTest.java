package com.lau.javabasics.java.basics.current;

public class SynchronizedTest {

    public static void main(String[] args) {
        synchronized (SynchronizedTest.class) {
            method();
            method1();
        }
    }

    private  static void method() {

    }
    private   static void method1() {
        synchronized (SynchronizedTest.class) {
            System.out.println("method1");
        }
    }
}
