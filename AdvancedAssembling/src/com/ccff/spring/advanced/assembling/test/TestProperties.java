package com.ccff.spring.advanced.assembling.test;

import com.ccff.spring.advanced.assembling.config.PropertiesConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class TestProperties {
    @Test
    public void testDataSource(){
        ApplicationContext context = new AnnotationConfigApplicationContext(PropertiesConfig.class);
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource.getClass().getName());
    }

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(PropertiesConfig.class);
        String url = context.getEnvironment().getProperty("jdbc.database.url");
        System.out.println(url);
    }
}