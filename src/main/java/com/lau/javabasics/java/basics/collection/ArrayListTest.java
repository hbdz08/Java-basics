package com.lau.javabasics.java.basics.collection;

import java.util.ArrayList;

/**
 * @author lau
 */
public class ArrayListTest {

    public static final String s = "234";
    public void test() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("123");
        strings.add(null);
        strings.add("1232");
        strings.forEach(System.out::println);

    }

    public static void main(String[] args) {
        ArrayListTest arrayListTest = new ArrayListTest();
        arrayListTest.test();
    }
}
