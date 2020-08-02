package com.lau.javabasics.spring.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    ReentrantLock reentrantLock = new ReentrantLock();

    public void test() {
        if (reentrantLock.tryLock()) {
            reentrantLock.lock();
            try {
            //todo

            } catch (Exception e) {
                throw e;

            }finally {
                reentrantLock.unlock();
            }
        }
    }
}
