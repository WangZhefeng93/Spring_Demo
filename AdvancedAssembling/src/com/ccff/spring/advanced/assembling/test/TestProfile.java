package com.ccff.spring.advanced.assembling.test;

import com.ccff.spring.advanced.assembling.config.ProfileConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@ActiveProfiles("dev")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileConfig.class)
public class TestProfile {
    @Autowired
    private DataSource dataSource;

    @Test
    public void testProfileStart(){
        System.out.println(dataSource.getClass().getName());
    }
}