package com.supreme7.设计模式.singleton;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/4 上午11:08
 * @Description:  懒汉式  加锁
 */
public class LazySingleton1 {
    private static LazySingleton1 lazySingleton= null;
    private LazySingleton1(){}
    public synchronized static LazySingleton1 getLazySingleton(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton1();
        }
        return lazySingleton;
    }
}
