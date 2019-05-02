package com.ccff.spring.assembling.pojo;

public class School {
    private String school_name;
    private String school_no;
    private String school_location;

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getSchool_no() {
        return school_no;
    }

    public void setSchool_no(String school_no) {
        this.school_no = school_no;
    }

    public String getSchool_location() {
        return school_location;
    }

    public void setSchool_location(String school_location) {
        this.school_location = school_location;
    }

    @Override
    public String toString() {
        return "School{" +
                "school_name='" + school_name + '\'' +
                ", school_no='" + school_no + '\'' +
                ", school_location='" + school_location + '\'' +
                '}';
    }
}
