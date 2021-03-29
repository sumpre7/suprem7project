package com.supreme7.设计模式.迭代器模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hehuan
 * @Title: Supreme7Project
 * @date 2020/11/4 9:51 下午
 * @Description:
 */
public class MyAggregate implements Aggregate {

    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return null;
    }
}
