package com.supreme7.设计模式.singleton;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/4 上午11:08
 * @Description:  内部类实现线程安全的单例
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){}
    public static LazyInnerClassSingleton getLazySingleton(){
        return LazyHolder.lazySingleton;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton lazySingleton = new LazyInnerClassSingleton();
    }
}
