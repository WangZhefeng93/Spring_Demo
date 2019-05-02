package com.ccff.spring.advanced.assembling.test;

import com.ccff.spring.advanced.assembling.config.RoleConfig;
import com.ccff.spring.advanced.assembling.pojo.Role;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRole {
    @Test
    public void isEqual(){
        ApplicationContext context = new AnnotationConfigApplicationContext(RoleConfig.class);
        Role role1 = (Role) context.getBean("role");
        Role role2 = (Role) context.getBean("role");
        System.out.println("判断role1和role2是否为同一个对象："+(role1 == role2));
    }
}
