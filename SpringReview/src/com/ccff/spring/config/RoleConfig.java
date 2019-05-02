package com.ccff.spring.config;

import com.ccff.spring.controller.RoleController;
import com.ccff.spring.pojo.Role;
import com.ccff.spring.service.RoleService;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {Role.class,RoleService.class,RoleController.class})
public class RoleConfig {
}
