package com.ccff.spring.service.impl;

import com.ccff.spring.pojo.Role;
import com.ccff.spring.service.RoleService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service2")
public class RoleServiceImpl2 implements RoleService2 {
    @Autowired
    private Role role = null;

    @Override
    public void printRole() {
        System.out.println("【开始打印角色信息】\n"+role);
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
