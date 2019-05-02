package com.ccff.spring.di.ways.pojo;

public class Student {
    private String name;
    private String sex;
    private String studentNo;
    private Integer age;

    public Student() {
    }

    public Student(String name, String sex, String studentNo, Integer age) {
        this.name = name;
        this.sex = sex;
        this.studentNo = studentNo;
        this.age = age;
    }

    public Student(String name, String studentNo) {
        this.name = name;
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
