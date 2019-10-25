package com.liyujie.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    String name;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
//    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date birth;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
