package com.ccff.spring.aspectj.config;

import com.ccff.spring.aspectj.aspect.RoleAspect;
import com.ccff.spring.aspectj.service.RoleService;
import com.ccff.spring.aspectj.service.RoleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.ccff.spring.aspectj")
public class AOPConfig {

    @Bean
    public RoleAspect roleAspect(){
        return new RoleAspect();
    }

    @Bean
    public RoleService roleService(){
        return new RoleServiceImpl();
    }

}
