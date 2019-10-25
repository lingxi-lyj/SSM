package com.lyj.pojo;

public class Pig {
    private String name;
    private Integer sleep;//睡觉时间
    private String kw;//口味

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", sleep=" + sleep +
                ", kw='" + kw + '\'' +
                '}';
    }

    public String getKw() {
        return kw;
    }

    public void setKw(String kw) {
        this.kw = kw;
    }

    public Integer getSleep() {

        return sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
