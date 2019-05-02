package com.ccff.spring.annotation;

import com.ccff.spring.pojo.Role;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackageClasses = {Role.class})
@ImportResource({"classpath:spring-config.xml"})
public class ApplicationConfig {
}
