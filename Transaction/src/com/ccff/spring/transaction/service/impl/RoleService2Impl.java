package com.ccff.spring.transaction.service.impl;

import com.ccff.spring.transaction.config.JavaConfig;
import com.ccff.spring.transaction.mapper.RoleMapper;
import com.ccff.spring.transaction.pojo.Role;
import com.ccff.spring.transaction.service.RoleService2;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component
public class RoleService2Impl implements RoleService2 {
    @Autowired
    private RoleMapper roleMapper = null;

    Logger logger = Logger.getLogger(RoleService2Impl.class);

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public int insertRole(Role role) {
        return roleMapper.insertRole(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    public int insertListRole(List<Role> roleList) {
        int count = 0;
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        RoleService2 roleService2 = context.getBean(RoleService2.class);
        for (Role role : roleList){
            try{
                count += roleService2.insertRole(role);
            }catch (Exception ex){
                logger.info(ex);
            }
        }
        return count;
    }
}
