package com.liyujie.SpringAOPAnnotation.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//springAOP只能在运行期织入，如果你做的功能不是特别的强。
@Order(3)
@Aspect
@Component
public class AfterAdvice {
    @After("execution(* com.liyujie.SpringAOPAnnotation.service.BadBaby.eat(java.lang.String))")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+Arrays.toString(joinPoint.getArgs()));
        System.out.println("在1执行完之后运行");
    }
}
