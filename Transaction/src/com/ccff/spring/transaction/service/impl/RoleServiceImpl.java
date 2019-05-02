package com.ccff.spring.transaction.service.impl;

import com.ccff.spring.transaction.mapper.RoleMapper;
import com.ccff.spring.transaction.pojo.Role;
import com.ccff.spring.transaction.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Component
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper = null;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public int insertRole(Role role) {
        int count = roleMapper.insertRole(role);
        //操作一些与数据库无关的操作
        //doSomethingForFile();
        return count;
    }
}
