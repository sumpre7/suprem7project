package com.supreme7.设计模式.singleton;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/4 上午11:20
 * @Description:
 */
class LazySingletonTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new LazySingletonExectorThread());
        Thread thread2 = new Thread(new LazySingletonExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("Thread end");
    }



}