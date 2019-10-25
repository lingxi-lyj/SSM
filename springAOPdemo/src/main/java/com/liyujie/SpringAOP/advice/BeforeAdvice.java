package com.liyujie.SpringAOP.advice;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class BeforeAdvice {
    public void methodAdvice(){
        System.out.println("我是在方法之前执行。。。。。。。。。");
    }
    //JoinPoint可以获取几乎所有的这个方法的信息。
    public void before(JoinPoint joinPoint){
        String str= joinPoint.getSignature().getName();
        Object[]args=joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println(str);
    }

}
