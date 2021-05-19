package com.company;

import com.company.Manager.InstructorManager;
import com.company.Manager.UserManager;
import com.company.Util.Instructor;
import com.company.Util.Student;
import com.company.Util.User;

public class Main {

    public static void main(String[] args) {

        InstructorManager userManager = new InstructorManager();
        User[] users = {new Student(123,"Talih","TTT"),new Instructor(12345,"Engin")};
        userManager.addMultiple(users);

    }
}
