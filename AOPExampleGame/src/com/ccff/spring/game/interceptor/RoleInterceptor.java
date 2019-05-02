package com.ccff.spring.game.interceptor;

public class RoleInterceptor implements Interceptor {
    @Override
    public void before(Object object) {
        System.out.println("before方法执行，准备打印角色信息！");
    }

    @Override
    public void after(Object object) {
        System.out.println("after方法执行，已经完成角色信息的打印处理！");
    }

    @Override
    public void afterReturning(Object object) {
        System.out.println("afterReturning方法执行，刚刚完成打印功能，一切正常！");
    }

    @Override
    public void afterThrowing(Object object) {
        System.out.println("afterThrowing方法执行，打印功能执行异常，请查看角色对象是否为空");
    }
}
