package com.lau.javabasics.java.basics.current;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadLocalTests implements Runnable {
    ThreadLocal<String> local = new ThreadLocal();
    public void test1() {

        String s = local.get();
        if (StringUtils.isEmpty(s)) {
            local.set("123" +Thread.currentThread().getState());
        }
        System.out.println(s);
        System.out.println(local.get());
    }
    @Override
    public void run() {
        test1();
    }


    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(50));
        for (int i = 0; i < 40; i++) {

            threadPoolExecutor.execute(new ThreadLocalTests());

        }

    }

}


