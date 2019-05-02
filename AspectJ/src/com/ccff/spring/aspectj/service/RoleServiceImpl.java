package com.ccff.spring.aspectj.service;

import com.ccff.spring.aspectj.pojo.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role,int sort) {
        System.out.println("排序参数sort的值为："+sort+"——"+role.toString());
    }
}
