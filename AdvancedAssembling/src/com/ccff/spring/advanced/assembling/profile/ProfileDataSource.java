package com.ccff.spring.advanced.assembling.profile;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

@Component
public class ProfileDataSource {

    @Bean(name = "devDevDataSource")
    @Profile("dev")
    public DataSource getDevDataSource(){
        System.out.println("启动的是dev的Profile");
        Properties properties = new Properties();
        properties.setProperty("driver","com.mysql.jdbc.Driver");
        properties.setProperty("url","jdbc:mysql://localhost:3306/spring_profile_dev");
        properties.setProperty("username","root");
        properties.setProperty("password","root");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  dataSource;
    }

    @Bean(name = "testDevDataSource")
    @Profile("test")
    public DataSource getTestDataSource(){
        System.out.println("启动的是test的Profile");
        Properties properties = new Properties();
        properties.setProperty("driver","com.mysql.jdbc.Driver");
        properties.setProperty("url","jdbc:mysql://localhost:3306/spring_profile_test");
        properties.setProperty("username","root");
        properties.setProperty("password","root");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  dataSource;
    }

}
