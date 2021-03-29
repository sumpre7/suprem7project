package com.supreme7.集合;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2021/3/22 上午7:22
 * @Description:
 */
public class 迭代器 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("使用迭代器1");
        linkedList.add("使用迭代器2");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
