package com.liyujie.SpringAOPAnnotation.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(2)
@Aspect
@Component
public class BeforeAdvice2 {
    @Before("execution(* com..*.*(..))")
    public void before(JoinPoint joinPoint){
        //获取方法和方法里的参数。
        System.out.println(joinPoint.getSignature().getName()+Arrays.toString(joinPoint.getArgs()));
        System.out.println("在一个光年以前的。。。。。");
    }
}

