package com.lau.javabasics;

import com.lau.javabasics.spring.service.Test3;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavabasicsApplicationTests {
    @Autowired
    com.lau.javabasics.spring.service.Test test;

    @Test
    void contextLoads() {
        test.print();
    }

    public static void main(String[] args) {
        int a =3;
        int n = 0;
//        n  = 1+ a++ ;
//        System.out.println(a);
        System.out.println(a);
    }

}
