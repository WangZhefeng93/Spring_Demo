package com.ccff.spring.assembling.test;

import com.ccff.spring.assembling.pojo.Role;
import com.ccff.spring.assembling.pojo.UserRoleAssembly;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestNamespace {
    private ApplicationContext context;

    @Before
    public void getContainer(){
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void TestAssembingBeanByCAndP(){
        Role role3 = (Role) context.getBean("role3");
        Role role4 = (Role) context.getBean("role4");
        System.out.println(role3);
        System.out.println(role4);
    }

    @Test
    public void TestAssembingBeanByXMLUtils(){
        UserRoleAssembly userRoleAssembly = (UserRoleAssembly) context.getBean("userRoleAssembly2");
        List list = userRoleAssembly.getList();
        Map map = userRoleAssembly.getMap();
        Set set = userRoleAssembly.getSet();
        System.out.println("List集合为：");
        System.out.println(list);
        System.out.println();
        System.out.println("Map集合为：");
        System.out.println(map);
        System.out.println();
        System.out.println("Set为：");
        System.out.println(set);
    }
}
