package com.lau.javabasics.java.basics.current;

import lombok.SneakyThrows;
import org.openjdk.jol.info.ClassLayout;

public class SynchronizedTest {

    @SneakyThrows
    public static void main(String[] args) {
//        synchronized (SynchronizedTest.class) {
//            method();
//            method1();
//        }
        Thread.sleep(5000);

        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        synchronized (o) {
            System.out.println(ClassLayout.parseInstance(o).toPrintable());

        }

        method1();
    }

    private  static void method() {

    }
    private synchronized   static void method1() {

    }
}
