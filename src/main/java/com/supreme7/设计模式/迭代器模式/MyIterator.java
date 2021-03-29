package com.supreme7.设计模式.迭代器模式;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/4 9:56 下午
 * @Description:
 */
public class MyIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
