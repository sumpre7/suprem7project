package com.supreme7.java8新特性;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Handler;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/10/16 12:22 下午
 * @Description:
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Map map = null;
        if(map == null){
            System.out.println("map is null");
        }else {
            System.out.println("map is not null");
        }

        Optional<Map> map1 = Optional.ofNullable(map);
        boolean present = map1.isPresent();
        System.out.println("present:"+present);


        // 1、创建一个包装对象值为空的Optional对象
        Optional<String> optEmpty = Optional.empty();

        System.out.println("optEmpty:"+optEmpty.isPresent());

        // 2、创建包装对象值非空的Optional对象(使用of方法一定要保证对象非空，否则会抛异常)
        Optional<String> optOf = Optional.of("optional");
        System.out.println("optOf:"+optOf.isPresent());

        // 3、创建包装对象值允许为空也可以不为空的Optional对象
        Optional<String> optOfNullable1 = Optional.ofNullable(null);
        Optional<String> optOfNullable2 = Optional.ofNullable("optional");
    }
}
