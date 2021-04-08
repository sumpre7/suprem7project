package com.supreme7.设计模式.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/6 上午7:46
 * @Description:  反射破坏单例
 */
class LazyInnerClassSingletonTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = LazyInnerClassSingleton.class;
        // 通过反射获取私有的构造方法
        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        //强制访问
        declaredConstructor.setAccessible(true);

        //暴力初始化
        Object o1 = declaredConstructor.newInstance();

        // 这块调用了两次构造方法，相当于 new 了两次，犯了原则性错误
        Object o2 = declaredConstructor.newInstance();


        System.out.println(o1 == o2);
    }

}