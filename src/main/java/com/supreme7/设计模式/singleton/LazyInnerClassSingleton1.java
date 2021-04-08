package com.supreme7.设计模式.singleton;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/4 上午11:08
 * @Description:  内部类实现线程安全的单例--- 处理反射破坏单例的情况
 */
public class LazyInnerClassSingleton1 {

    /**
     * 使用的时候，默认会先初始化内部类
     * 如果没有使用，则内部类是不加载的
     */
    private LazyInnerClassSingleton1(){
        if (LazyHolder.lazySingleton  != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }
    /** （static） 是为了使单例的空间共享
     * （final） 保证这个方法不会被重写，重载
     */
    public static final LazyInnerClassSingleton1 getLazySingleton(){
        return LazyHolder.lazySingleton;
    }

    /**
     * 默认不加载
     */
    private static class LazyHolder{
        private static final LazyInnerClassSingleton1 lazySingleton = new LazyInnerClassSingleton1();
    }
}
