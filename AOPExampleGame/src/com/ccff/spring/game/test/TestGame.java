package com.ccff.spring.game.test;

import com.ccff.spring.game.factory.ProxyBeanFactory;
import com.ccff.spring.game.interceptor.Interceptor;
import com.ccff.spring.game.interceptor.RoleInterceptor;
import com.ccff.spring.game.pojo.Role;
import com.ccff.spring.game.service.RoleService;
import com.ccff.spring.game.service.RoleServiceImpl;
import org.junit.Test;

public class TestGame {
    @Test
    public void test(){
        RoleService roleService = new RoleServiceImpl();
        Interceptor interceptor = new RoleInterceptor();
        RoleService proxy = ProxyBeanFactory.getBean(roleService,interceptor);
        Role role = new Role(1L,"role-name-1","role_note-1");
        proxy.printRole(role);
        System.out.println("===============测试afterThrowing方法========================");
        role = null;
        proxy.printRole(role);
    }
}
