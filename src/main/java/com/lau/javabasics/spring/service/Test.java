package com.lau.javabasics.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Test implements Test3 {
    @Resource
    Test1 test1;

    @Override
    public void print() {
        System.out.println("Test.class" + test1);
    }
}
