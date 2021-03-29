package com.supreme7.多线程.singleton;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/27 上午9:12
 * @Description:
 */
public class 饿汉式 {

    public static 饿汉式 getINSTANCE() {
        return INSTANCE;
    }

    private static final 饿汉式 INSTANCE = new 饿汉式();

    private 饿汉式() {
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        饿汉式 e1 = new 饿汉式();
        System.out.println(e1);
        饿汉式 e2 = 饿汉式.getINSTANCE();
        饿汉式 e3 = 饿汉式.getINSTANCE();
        System.out.println(e1 == e2);
        System.out.println(e2 == e3);
    }



}
