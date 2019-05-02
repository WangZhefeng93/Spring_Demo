package com.ccff.spring.xml.aop.service;


import com.ccff.spring.xml.aop.pojo.Role;

public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println(role.toString());
    }
}
