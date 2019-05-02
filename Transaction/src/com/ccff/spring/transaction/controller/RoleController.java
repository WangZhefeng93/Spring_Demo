package com.ccff.spring.transaction.controller;

import com.ccff.spring.transaction.pojo.Role;
import com.ccff.spring.transaction.service.RoleListService;
import com.ccff.spring.transaction.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleController {
    @Autowired
    private RoleService roleService = null;

    @Autowired
    private RoleListService roleListService = null;

    public void errerUseServices(){
        Role role1 = new Role();
        role1.setRoleName("role1-name");
        role1.setRoleNote("role1-note");
        roleService.insertRole(role1);

        Role role2 = new Role();
        role2.setRoleName("role2-name");
        role2.setRoleNote("role2-note");
        roleService.insertRole(role2);
    }

    @RequestMapping("/addRole")
    @ResponseBody
    public Role addRole(Role role){
        roleService.insertRole(role);
        //doSomethingForFile();
        return role;
    }
}
