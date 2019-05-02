package com.ccff.spring.assembling.test;

import com.ccff.spring.assembling.pojo.School;
import com.ccff.spring.assembling.pojo.Student;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    private ApplicationContext context;

    @Before
    public void getContainer(){
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void TestEasyAssembingByXML(){
        School school = (School) context.getBean("school");
        System.out.println(school);
        Student student1 = (Student) context.getBean("student");
        System.out.println(student1);
    }
}
