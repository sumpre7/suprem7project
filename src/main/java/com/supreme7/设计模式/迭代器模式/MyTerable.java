package com.supreme7.设计模式.迭代器模式;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/4 9:32 下午
 * @Description:
 */
public class MyTerable implements Iterable {
    public Iterator iterator() {
        return null;
    }

    public void forEach(Consumer action) {

    }

    public Spliterator spliterator() {
        return null;
    }
}
