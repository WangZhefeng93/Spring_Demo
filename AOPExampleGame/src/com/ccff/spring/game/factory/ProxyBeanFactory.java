package com.ccff.spring.game.factory;

import com.ccff.spring.game.interceptor.Interceptor;

public class ProxyBeanFactory {
    public static <T> T getBean(T object, Interceptor interceptor) {
        return (T) ProxyBeanUtil.getBean(object,interceptor);
    }
}