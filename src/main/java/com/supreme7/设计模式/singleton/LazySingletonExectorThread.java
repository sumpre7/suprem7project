package com.supreme7.设计模式.singleton;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/4 上午11:42
 * @Description:
 */
public class LazySingletonExectorThread implements Runnable {


    @Override
    public void run() {
        LazySingleton singleton = LazySingleton.getLazySingleton();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
