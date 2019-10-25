package com.liyujie.SpringAOPAnnotation.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Order(2)
@Aspect
@Component
public class AfterAdvice2 {
    @After("execution(* com.liyujie.SpringAOPAnnotation.service.BadBaby.eat(java.lang.String))")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+ Arrays.toString(joinPoint.getArgs()));
        System.out.println("在2执行之后运行它。。。");
    }
}
