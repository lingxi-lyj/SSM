package com.liyujie.SpringAOPAnnotation.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Aspect
@Component
public class BeforeAdvice3 {
    @Before("execution(* com..*.*(..))")
    public void show(){
        System.out.println("在十万光光年以前。。。。。");
    }
}
