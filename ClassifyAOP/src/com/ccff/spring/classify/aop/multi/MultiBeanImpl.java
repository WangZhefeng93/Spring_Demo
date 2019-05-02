package com.ccff.spring.classify.aop.multi;

public class MultiBeanImpl implements MultiBean {
    @Override
    public void testMulti() {
        System.out.println("test multi aspects!!!");
    }
}
