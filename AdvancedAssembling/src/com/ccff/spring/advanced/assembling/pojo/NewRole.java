package com.ccff.spring.advanced.assembling.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("newRole")
public class NewRole {
    //赋值为long型
    @Value("#{1}")
    private Long roleId;
    //字符串赋值
    @Value("#{'new_role_name1'}")
    private String roleName;
    //字符串赋值
    @Value("#{'new_role_note1'}")
    private String roleNote;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleNote() {
        return roleNote;
    }

    public void setRoleNote(String roleNote) {
        this.roleNote = roleNote;
    }

    @Override
    public String toString() {
        return "NewRole{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleNote='" + roleNote + '\'' +
                '}';
    }
}
