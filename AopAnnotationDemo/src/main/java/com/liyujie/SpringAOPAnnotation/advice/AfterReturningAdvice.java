package com.liyujie.SpringAOPAnnotation.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AfterReturningAdvice {
    @AfterReturning(value = "execution(* com.liyujie.SpringAOPAnnotation.service.BadBaby.star())",returning ="str")
    public void  afterReturning(String str){
        System.out.println("返回值之后执行。。。。。。");
        System.out.println("返回值:"+str);

    }
}
