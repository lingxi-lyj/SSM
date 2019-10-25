package com.liyujie.SpringAOPAnnotation.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AfterThrowingAdvice {
    @AfterThrowing(value = "execution(* com.liyujie.SpringAOPAnnotation.service.BadBaby.throwing())",throwing = "throwmes")
    public void afterThrowing(JoinPoint joinPoint,Exception throwmes){
        System.out.println("异常之后"+joinPoint.getSignature().getName());
        System.out.println("异常信息"+throwmes);
//        throw new RuntimeException("我故意制造的异常");

    }
}
