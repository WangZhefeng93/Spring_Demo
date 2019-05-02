package com.ccff.spring.test;

import com.ccff.spring.annotation.ApplicationConfig;
import com.ccff.spring.mapper.RoleMapper;
import com.ccff.spring.pojo.Role;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleTest {
    Role role = null;
    RoleMapper roleMapper = null;
    ApplicationContext context = null;

    @Before
    public void getContext(){
        context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        role = context.getBean(Role.class);
        roleMapper = context.getBean(RoleMapper.class);
    }

    @Test
    public void testSqlSessionTemplate(){
        SqlSessionTemplate sqlSessionTemplate = context.getBean(SqlSessionTemplate.class);
        //添加用户
        Role role = context.getBean(Role.class);
        role.setRoleName("role-name-sqlSessionTemplate");
        role.setRoleNote("role-note-sqlSessionTemplate");
        sqlSessionTemplate.insert("com.ccff.spring.mapper.RoleMapper.insertRole",role);

        //查询用户
        Long id = role.getId();
        role = sqlSessionTemplate.selectOne("com.ccff.spring.mapper.RoleMapper.getRoleById",id);
        System.out.println(role);

        //更新用户
        role.setRoleName("update-role-name-sqlSessionTemplate");
        sqlSessionTemplate.update("com.ccff.spring.mapper.RoleMapper.updateRole",role);

        //删除用户
        sqlSessionTemplate.delete("com.ccff.spring.mapper.RoleMapper.deleteRole",id);
    }

    @Test
    public void test(){
        /**
         * 测试插入
         */
        role.setRoleName("role-name-1");
        role.setRoleNote("role-note-1");
        roleMapper.insertRole(role);

        /**
         * 测试查询
         */
        role = roleMapper.getRoleById(role.getId());
        System.out.println("【查询到的角色信息为：】\n"+role);

        /**
         * 测试修改
         */
        role.setRoleName("update-role-name-1");
        role.setRoleNote("update-role-note-1");
        roleMapper.updateRole(role);

        /**
         * 测试删除
         */
        roleMapper.deleteRole(role.getId());
    }

}
