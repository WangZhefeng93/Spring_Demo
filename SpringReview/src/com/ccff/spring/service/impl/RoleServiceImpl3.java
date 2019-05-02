package com.ccff.spring.service.impl;

import com.ccff.spring.pojo.Role;
import com.ccff.spring.service.RoleService;
import com.ccff.spring.service.RoleService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("service3")
public class RoleServiceImpl3 implements RoleService {

    @Override
    public void printRole(Role role) {
        System.out.println("【开始打印role-4的信息】\nrole-4的编号为："+role.getId()+
                "\nrole的姓名为："+role.getRoleName()+
                "\nrole的备注为："+role.getRoleNote());
    }
}
