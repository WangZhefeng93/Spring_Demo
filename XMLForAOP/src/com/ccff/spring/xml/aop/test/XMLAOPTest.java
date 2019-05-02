package com.ccff.spring.xml.aop.test;

import com.ccff.spring.xml.aop.pojo.Role;
import com.ccff.spring.xml.aop.service.RoleService;
import com.ccff.spring.xml.aop.verifier.RoleVerifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLAOPTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        RoleService roleService = (RoleService) context.getBean("roleService");
        Role role = new Role();
        role.setRoleId(1L);
        role.setRoleName("role-name-1");
        role.setRoleNote("role-note-1");
        RoleVerifier roleVerifier = (RoleVerifier) roleService;
        if (roleVerifier.verify(role))
            roleService.printRole(role);
        else
            System.out.println("Role对象为空");
        System.out.println("===============测试role为空========================");
        role = null;
        if (roleVerifier.verify(role))
            roleService.printRole(role);
        else
            System.out.println("Role对象为空");
    }
}
