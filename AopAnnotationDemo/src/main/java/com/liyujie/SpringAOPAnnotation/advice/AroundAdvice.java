package com.liyujie.SpringAOPAnnotation.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AroundAdvice {
    @Around( "execution(* com.liyujie.SpringAOPAnnotation.service.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp){
        try {
            System.out.println("环绕执行");
            Object obj=pjp.proceed();
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }



    }
}
