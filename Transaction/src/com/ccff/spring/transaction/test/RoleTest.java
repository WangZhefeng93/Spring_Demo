package com.ccff.spring.transaction.test;

import com.ccff.spring.transaction.config.JavaConfig;
import com.ccff.spring.transaction.pojo.Role;
import com.ccff.spring.transaction.service.RoleListService;
import com.ccff.spring.transaction.service.RoleService;
import com.ccff.spring.transaction.service.RoleService2;
import com.ccff.spring.transaction.service.impl.RoleServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class RoleTest {
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        RoleListService roleListService = context.getBean(RoleListService.class);
        List<Role> roleList = new ArrayList<>();

        //RoleService roleService = context.getBean(RoleService.class);

        for (int i = 1; i <= 3; i++) {
            Role role = context.getBean(Role.class);
            role.setId(Long.parseLong(i+""));
            role.setRoleName("role-name-"+i);
            role.setRoleNote("role-note-"+i);
            roleList.add(role);
        }
        int count = roleListService.insertListRole(roleList);

        /*Role role = context.getBean(Role.class);
        role.setRoleName("role-name-4");
        role.setRoleNote("role-note-4");
        roleList.add(role);
        int count = roleService.insertRole(role);*/

        System.out.println(count);
    }

    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        RoleService2 roleService2 = context.getBean(RoleService2.class);
        List<Role> roleList = new ArrayList<>();
        for (int i = 4; i <= 6; i++) {
            Role role = context.getBean(Role.class);
            role.setRoleName("role-name-"+i);
            role.setRoleNote("role-note-"+i);
            roleList.add(role);
        }
        int count = roleService2.insertListRole(roleList);
        System.out.println(count);
    }
}
