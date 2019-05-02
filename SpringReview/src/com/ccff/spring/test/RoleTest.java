package com.ccff.spring.test;

import com.ccff.spring.controller.RoleController;
import com.ccff.spring.pojo.Role;
import com.ccff.spring.config.RoleConfig;
import com.ccff.spring.service.RoleService;
import com.ccff.spring.service.RoleService2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RoleTest {
    AnnotationConfigApplicationContext context;

    @Before
    public void getContext(){
        context = new AnnotationConfigApplicationContext(RoleConfig.class);
    }

    @Test
    public void test1(){
        Role role = context.getBean(Role.class);
        System.out.println(role);
    }

    @Test
    public void test2(){
        RoleService service = context.getBean(RoleService.class);
        Role role = context.getBean(Role.class);
        service.printRole(role);
    }

    @Test
    public void test3(){
        RoleService2 service2 = context.getBean(RoleService2.class);
        service2.printRole();
    }

    @Test
    public void test4(){
        RoleController controller = context.getBean(RoleController.class);
        Role role = context.getBean(Role.class);
        controller.print(role);
    }

    @After
    public void closeContext(){
        if (context != null)
            context.close();
    }
}
