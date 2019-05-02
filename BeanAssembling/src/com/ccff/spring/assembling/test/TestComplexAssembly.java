package com.ccff.spring.assembling.test;

import com.ccff.spring.assembling.pojo.ComplexAssembly;
import com.ccff.spring.assembling.pojo.UserRoleAssembly;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestComplexAssembly {
    private ApplicationContext context;

    @Before
    public void getContainer(){
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void TestComplexAssembingByXML(){
        ComplexAssembly complexAssembly = (ComplexAssembly) context.getBean("complexAssembly");
        List list = complexAssembly.getList();
        Map map = complexAssembly.getMap();
        Properties properties = complexAssembly.getProperties();
        Set set = complexAssembly.getSet();
        String[] array = complexAssembly.getArray();
        System.out.println("List集合为：");
        System.out.println(list);
        System.out.println();
        System.out.println("Map集合为：");
        System.out.println(map);
        System.out.println();
        System.out.println("Properties为：");
        System.out.println(properties);
        System.out.println();
        System.out.println("Set为：");
        System.out.println(set);
        System.out.println();
        System.out.println("Array为：");
        System.out.println(array);
        System.out.println();
    }

    @Test
    public void TestUserRoleAssembly(){
        UserRoleAssembly userRoleAssembly = (UserRoleAssembly) context.getBean("userRoleAssembly");
        List list = userRoleAssembly.getList();
        Map map = userRoleAssembly.getMap();
        Set set = userRoleAssembly.getSet();
        System.out.println("UserRoleAssembly的id为："+userRoleAssembly.getId());
        System.out.println("UserRoleAssembly的list为：");
        System.out.println(list);
        System.out.println("UserRoleAssembly的Map为：");
        System.out.println(map);
        System.out.println("UserRoleAssembly的Set为：");
        System.out.println(set);
    }
}
