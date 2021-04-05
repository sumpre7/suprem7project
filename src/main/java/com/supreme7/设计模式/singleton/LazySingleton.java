package com.supreme7.设计模式.singleton;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/4 上午11:08
 * @Description:  懒汉式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton= null;
    private LazySingleton(){}
    public static LazySingleton getLazySingleton(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
