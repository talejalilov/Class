package com.company.Manager;

import com.company.Util.User;

public class StudentManager extends UserManager {

    public void add(User user){
        System.out.println( user.getId() + " Numarali kullanici eklenmistir");

    }

    public void addMultiple(User [] users){

        for (User user : users){
            add(user);
        }

    }

}
