package com.ccff.spring.game.interceptor;

public interface Interceptor {
    void before(Object object);
    void after(Object object);
    void afterReturning(Object object);
    void afterThrowing(Object object);
}
