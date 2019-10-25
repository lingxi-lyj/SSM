package com.liyujie.springtest.pojo;

public class Dog {
    private String name;

    public Dog(){
        System.out.println("好狗！");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
