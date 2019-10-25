package com.liyujie.springtest.pojo;

public class Girl {

    String name;

    Integer age;
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Girl(){
        System.out.println("初始化。。。。");
    }
    public String getName() {
        return name;
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
    public void cleardree(){
        System.out.println("所有任务完成后，我要关闭任务了。");
    }
    public void dress(){
        System.out.println("我要开始做做任务了！");
    }
}
