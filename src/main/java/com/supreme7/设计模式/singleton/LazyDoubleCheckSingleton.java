package com.supreme7.设计模式.singleton;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/4 上午11:08
 * @Description:  懒汉式  加锁
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton lazySingleton= null;
    private LazyDoubleCheckSingleton(){}
    public static LazyDoubleCheckSingleton getLazySingleton(){
        if (lazySingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
