package com.ccff.spring.classify.aop.service;

import com.ccff.spring.classify.aop.pojo.Role;

public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println(role.toString());
    }
}
