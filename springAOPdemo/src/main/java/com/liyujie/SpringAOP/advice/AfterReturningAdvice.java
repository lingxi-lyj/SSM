package com.liyujie.SpringAOP.advice;

public class AfterReturningAdvice {

    public void afterReturning(String returning){
        System.out.println("轻轻的我将离开你！");
        System.out.println("返回值："+returning);
    }
}
