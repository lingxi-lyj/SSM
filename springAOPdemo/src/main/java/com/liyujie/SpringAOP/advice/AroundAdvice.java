package com.liyujie.SpringAOP.advice;

import org.aspectj.lang.ProceedingJoinPoint;

import javax.annotation.processing.ProcessingEnvironment;

public class AroundAdvice {
    public Object round(ProceedingJoinPoint pjp){
        try {
            System.out.println("环绕地球80天。。。。");
            Object obj= pjp.proceed();
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }

    }
}
