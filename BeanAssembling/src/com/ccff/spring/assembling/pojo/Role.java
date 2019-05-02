package com.ccff.spring.assembling.pojo;

public class Role {
    private Long roleId;
    private String roleName;
    private String roleNote;

    public Role() {
    }

    public Role(Long roleId, String roleName, String roleNote) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleNote = roleNote;
    }

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
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleNote='" + roleNote + '\'' +
                '}';
    }
}
