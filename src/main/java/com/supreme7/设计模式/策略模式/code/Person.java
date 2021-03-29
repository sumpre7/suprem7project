package com.supreme7.设计模式.策略模式.code;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/14 下午3:35
 * @Description:
 */
public class Person {
    private TravelStrategy travelStrategy;


    public Person(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void goTrave(){
        travelStrategy.gotrave();
    }


}
