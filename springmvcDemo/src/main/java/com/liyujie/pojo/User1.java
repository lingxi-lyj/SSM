package com.liyujie.pojo;

public class User1 {
    String name;
    String pwd;

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public User1(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public User1() {
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
