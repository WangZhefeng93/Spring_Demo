package com.ccff.spring.di.ways.test;

import com.ccff.spring.di.ways.pojo.Student;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    private ApplicationContext context;

    @Before
    public void getContainer(){
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void TestDIByConstruction(){
        Student student_noneParam_construction = (Student) context.getBean("student_noneParam_construction");
        System.out.println("通过无参构造器创建的Student Bean对象：");
        System.out.println(student_noneParam_construction);

        Student student_Param_construction = (Student) context.getBean("student_Param_construction");
        System.out.println("通过第一个有参构造器创建的Student Bean对象：");
        System.out.println(student_Param_construction);

        Student student_Param_construction2 = (Student) context.getBean("student_Param_construction2");
        System.out.println("通过第二个有参构造器创建的Student Bean对象：");
        System.out.println(student_Param_construction2);
    }

    @Test
    public void TestDIBySetter(){
        Student student = (Student) context.getBean("student_setter");
        System.out.println("通过setter方法创建的Student Bean对象：");
        System.out.println(student);
    }
}
