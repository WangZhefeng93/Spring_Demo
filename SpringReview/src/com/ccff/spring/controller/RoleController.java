package com.ccff.spring.controller;

import com.ccff.spring.pojo.Role;
import com.ccff.spring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RoleController {

    @Autowired
    @Qualifier("service3")
    private RoleService service = null;

    public void print(Role role){
        service.printRole(role);
    }

}
