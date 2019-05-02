package com.ccff.spring.service.impl;

import com.ccff.spring.pojo.Role;
import com.ccff.spring.service.RoleService;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println("【开始打印role信息】\nrole的编号为："+role.getId()+
        "\nrole的姓名为："+role.getRoleName()+
        "\nrole的备注为："+role.getRoleNote());
    }
}
