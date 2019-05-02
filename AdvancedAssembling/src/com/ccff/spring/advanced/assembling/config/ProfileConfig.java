package com.ccff.spring.advanced.assembling.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ccff.spring.advanced.assembling.profile"})
public class ProfileConfig {
}
