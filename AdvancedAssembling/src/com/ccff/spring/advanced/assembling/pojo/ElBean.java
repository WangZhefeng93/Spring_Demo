package com.ccff.spring.advanced.assembling.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("elBean")
public class ElBean {
    //通过BeanName获取bean，然后注入
    @Value("#{newRole}")
    private NewRole newRole;

    //获取NewRole Bean的属性roleId
    @Value("#{newRole.roleId}")
    private Long id;

    //通过调用NewRole Bean的getRoleName()方法，获取角色name和note
    @Value("#{newRole.getRoleName().toString()+'--'+newRole.getRoleNote().toString()}")
    private String info;

    //通过Spring EL引入常量
    @Value("#{T(Math).PI}")
    private double pi;

    //通过Spring EL调用静态方法
    @Value("#{T(Math).random()}")
    private double random;

    //通过Spring EL进行运算
    @Value("#{newRole.roleId+1}")
    private int num;

    //通过Spring EL判断id是否为1
    @Value("#{newRole.roleId == 1}")
    private boolean equalId;

    //通过Spring EL判断roleName是否为"new_role_name1"
    @Value("#{newRole.getRoleName() eq 'new_role_name1'}")
    private boolean euqalRoleName;

    //通过Spring EL判断id是否大于2
    @Value("#{newRole.roleId > 2}")
    private boolean idgreater2;

    //使用Spring EL进行三目运算
    @Value("#{newRole.roleId<0?newRole.roleId:-1}")
    private int min;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public boolean isEqualId() {
        return equalId;
    }

    public void setEqualId(boolean equalId) {
        this.equalId = equalId;
    }

    public boolean isEuqalRoleName() {
        return euqalRoleName;
    }

    public void setEuqalRoleName(boolean euqalRoleName) {
        this.euqalRoleName = euqalRoleName;
    }

    public boolean isIdgreater2() {
        return idgreater2;
    }

    public void setIdgreater2(boolean idgreater2) {
        this.idgreater2 = idgreater2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getRandom() {
        return random;
    }

    public void setRandom(double random) {
        this.random = random;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public NewRole getNewRole() {
        return newRole;
    }

    public void setNewRole(NewRole newRole) {
        this.newRole = newRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ElBean{" +
                "newRole=" + newRole +
                ", id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}
