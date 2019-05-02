package com.ccff.spring.classify.aop.test;

import com.ccff.spring.classify.aop.pojo.Role;
import com.ccff.spring.classify.aop.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        RoleService roleService = (RoleService) context.getBean("roleService");
        Role role = new Role();
        role.setRoleId(1L);
        role.setRoleName("role-name-1");
        role.setRoleNote("role-note-1");
        roleService.printRole(role);
    }
}
