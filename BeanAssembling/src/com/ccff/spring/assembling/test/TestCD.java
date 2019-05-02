package com.ccff.spring.assembling.test;

import com.ccff.spring.assembling.config.CDPlayerConfig;
import com.ccff.spring.assembling.pojo.CDPlayer;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCD {
    private ApplicationContext context;

    @Before
    public void getContext(){
        context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
    }

    @Test
    public void TestBean(){
        CDPlayer cdPlayer = (CDPlayer) context.getBean("cdPlayer");
        cdPlayer.playMusic();
    }

    @Test
    public void TestBeanXML(){
        ApplicationContext contextXML = new ClassPathXmlApplicationContext("spring-config.xml");
        CDPlayer cdPlayer = (CDPlayer) contextXML.getBean("cdPlayer");
        cdPlayer.playMusic();
    }
}
