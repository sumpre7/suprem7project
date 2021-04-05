package com.supreme7.设计模式.singleton;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/4 上午10:59
 * @Description: 饿汉式
 */
public class HungrySingleton1 {

    private static HungrySingleton1 HUNGRY_SINGLETON = null;
    static {
        HUNGRY_SINGLETON = new HungrySingleton1();
    }
    private HungrySingleton1(){}
    public HungrySingleton1 getHungrySingleton(){
        return HUNGRY_SINGLETON;
    }
}
