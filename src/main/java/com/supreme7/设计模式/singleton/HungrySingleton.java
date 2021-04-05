package com.supreme7.设计模式.singleton;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/4/4 上午10:59
 * @Description: 饿汉式
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON= new HungrySingleton();
    private HungrySingleton(){}
    public HungrySingleton getHungrySingleton(){
        return HUNGRY_SINGLETON;
    }
}
