package com.ccff.spring.aspectj.test;

import com.ccff.spring.aspectj.check.RoleVerifier;
import com.ccff.spring.aspectj.config.AOPConfig;
import com.ccff.spring.aspectj.pojo.Role;
import com.ccff.spring.aspectj.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
        RoleService roleService = (RoleService) context.getBean("roleService");
        Role role = new Role();
        role.setRoleId(1L);
        role.setRoleName("role-name-1");
        role.setRoleNote("role-note-1");
        RoleVerifier roleVerifier = (RoleVerifier) roleService;
        if (roleVerifier.verify(role))
            roleService.printRole(role,1);
        else
            System.out.println("Role对象为空，不予打印");
        System.out.println("===============测试role为空========================");
        role = null;
        if (roleVerifier.verify(role))
            roleService.printRole(role,1);
        else
            System.out.println("Role对象为空，不予打印");
    }
}