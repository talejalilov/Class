package com.company.Util;

public class Instructor extends User{

    private String course;

    public Instructor(int id, String name) {
        super(id, name);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
