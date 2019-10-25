package com.liyujie.SpringAOPAnnotation.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(3)
@Aspect //标记其为一个切面。
@Component      //标记当前这个类为spring一个组件。相当于在我们的xml文件里注册了一个bean一样的效果。
public class BeforeAdvice {
    //execution(* com.*.*.*(..))- com下的任何子包下的任何类的任何方法都可以切到
   //execution(* com..*.*(..)) - 在com包及其子包下的任何类的任何方法都可以切到。

//    @Before("execution(* com..*.*(..))")//这里before里的值就相当于xml文件里的execution。
//    public void before3(){
//        System.out.println("在一个光年以前的。。。。。");
//    }
//

    @Before("execution(* com..*.*(..))")//这里before里的值就相当于xml文件里的execution。
    public void before(){
        System.out.println("在一个世纪以前的。。。。。");
    }
}
