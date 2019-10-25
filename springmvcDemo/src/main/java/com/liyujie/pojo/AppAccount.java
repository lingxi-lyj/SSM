package com.liyujie.pojo;

public class AppAccount {
    private Integer id;
    private String no;
    private String descroption;

    public AppAccount(Integer id, String no, String descroption) {
        this.id = id;
        this.no = no;
        this.descroption = descroption;
    }


    public AppAccount() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDescroption() {
        return descroption;
    }

    public void setDescroption(String descroption) {
        this.descroption = descroption;
    }
}
