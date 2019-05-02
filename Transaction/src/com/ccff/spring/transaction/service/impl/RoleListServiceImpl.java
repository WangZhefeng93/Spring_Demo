package com.ccff.spring.transaction.service.impl;

import com.ccff.spring.transaction.pojo.Role;
import com.ccff.spring.transaction.service.RoleListService;
import com.ccff.spring.transaction.service.RoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component
public class RoleListServiceImpl implements RoleListService {
    @Autowired
    private RoleService roleService = null;

    Logger logger = Logger.getLogger(RoleListServiceImpl.class);

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    public int insertListRole(List<Role> roleList) {
        int count = 0;
        for (Role role : roleList){
            try{
                count += roleService.insertRole(role);
            }catch (Exception ex){
                logger.info(ex);
            }
        }
        return count;
    }
}
