package com.ccff.spring.classify.aop.test;

import com.ccff.spring.classify.aop.config.MultiConfig;
import com.ccff.spring.classify.aop.multi.MultiBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMultiBean {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MultiConfig.class);
        MultiBean multiBean = (MultiBean) context.getBean("multiBean");
        multiBean.testMulti();
    }
}
