package com.supreme7.设计模式.策略模式.code;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/14 下午3:34
 * @Description:
 */
public class Plane implements TravelStrategy {
    @Override
    public void gotrave() {
        System.out.println("坐飞机去旅行");
    }
}
