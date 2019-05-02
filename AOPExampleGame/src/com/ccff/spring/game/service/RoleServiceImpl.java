package com.ccff.spring.game.service;

import com.ccff.spring.game.pojo.Role;

public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role){
        System.out.println("【打印角色对象的信息】\n"+role.toString());
    }
}
