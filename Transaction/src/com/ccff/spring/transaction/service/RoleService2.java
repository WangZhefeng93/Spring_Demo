package com.ccff.spring.transaction.service;

import com.ccff.spring.transaction.pojo.Role;

import java.util.List;

public interface RoleService2 {
    public int insertRole(Role role);
    public int insertListRole(List<Role> roleList);
}
