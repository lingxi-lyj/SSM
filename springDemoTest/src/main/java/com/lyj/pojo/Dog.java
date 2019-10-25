package com.lyj.pojo;

public class Dog {
    private String name;

    public Dog() {
        System.out.println("Dog无参初始化启动！");
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }
}
