package com.ccff.spring.classify.aop.aspect;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class ProxyFactoryBeanAspect implements MethodBeforeAdvice {
    /**
     * 前置通知
     * @param method：被拦截的方法
     * @param objects：参数 数组[role]
     * @param o：被拦截的对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知！！！");
    }
}
