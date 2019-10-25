package com.lyj.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
    private String name;
    private Integer age;
    private List<Integer> nums;
    private Set<Pig> pigs;
    private Map<String,User> userMap;

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Set<Pig> getPigs() {
        return pigs;
    }

    public void setPigs(Set<Pig> pigs) {
        this.pigs = pigs;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    private List<Cat> cats;

    public List<Integer> getNums() {
        return nums;
    }

    public void setNums(List<Integer> nums) {
        this.nums = nums;
    }

    public String[] getFrends() {
        return frends;
    }

    public void setFrends(String[] frends) {
        this.frends = frends;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String[] frends;
}
