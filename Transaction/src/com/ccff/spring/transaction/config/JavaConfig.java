package com.ccff.spring.transaction.config;

import com.ccff.spring.transaction.pojo.Role;
import com.ccff.spring.transaction.service.RoleService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackageClasses = {Role.class,RoleService.class})
@ImportResource({"spring-config.xml"})
@EnableTransactionManagement
public class JavaConfig{

}
