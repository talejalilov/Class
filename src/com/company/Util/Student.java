package com.company.Util;

public class Student extends User{

    private String school;

    public Student( int id, String name,String school) {
        super(id,name);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
