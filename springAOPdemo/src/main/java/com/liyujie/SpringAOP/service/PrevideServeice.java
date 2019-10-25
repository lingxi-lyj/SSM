package com.liyujie.SpringAOP.service;

public class PrevideServeice {
    public void add(){
        System.out.println("我添加一个供应商。。。。。");
    }
    public void search(String str){
        System.out.println("我查到了一个供应商。。。。。"+str);
    }
//    public void search(String str,int num){
//        System.out.println("我查到了一个供应商。。。。。"+str+num);
//    }
    public void search(String str,Integer num){
        System.out.println("我查到了一个供应商。。。。。"+str+num);
    }
    public void add(Privide privide){
        System.out.println("添加了"+privide.getName()+privide.getPrice());
    }
}
