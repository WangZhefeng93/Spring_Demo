package com.ccff.spring.advanced.assembling.pojo;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

@Component
public class DataSourceBean {
    @Value("${jdbc.database.driver}")
    private String driver = null;
    @Value("${jdbc.database.url}")
    private String url = null;
    @Value("${jdbc.database.username}")
    private String username = null;
    @Value("${jdbc.database.password}")
    private String password = null;

    @Bean(name = "dataSource")
    @Conditional({DataSourceCondition.class})
    public DataSource getDataSource(){
        Properties properties = new Properties();
        properties.setProperty("driver",driver);
        properties.setProperty("url",url);
        properties.setProperty("username",username);
        properties.setProperty("password",password);
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}