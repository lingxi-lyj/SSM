package com.lyj.pojo;

public class Gril {
    private String name;
    private Integer age;
    private Dog dog;
    public Dog getDog() {
        return dog;
    }
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void destroyDress(){
        System.out.println("我是在销毁bean后执行的！");
    }
    public void initExecute(){
        System.out.println("我是在执行bean之前执行！");
    }
    public String getName() {
        return name;
    }

    public Gril() {
        System.out.println("无参构造函数初始化。。。");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
