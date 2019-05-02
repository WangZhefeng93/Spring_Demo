package com.ccff.spring.mapper;

import com.ccff.spring.pojo.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    public int insertRole(Role role);
    public Role getRoleById(Long id);
    public int updateRole(Role role);
    public int deleteRole(Long id);
}
