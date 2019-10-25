package com.liyujie.SpringAOPAnnotation.service;

import org.springframework.stereotype.Component;

@Component
public class BadBaby {
    public void show(){
        System.out.println("Bad baby");
    }
    public void eat(String string){
        System.out.println("吃了一堆"+string);
    }
    public String star(){
        System.out.println("最亮的星星");
        return "王祖贤";
    }
    public void throwing(){
        System.out.println("准备异常。。。。");
        throw new RuntimeException("我故意制造的异常!");
    }
    public void round(){
        System.out.println("环绕方法执行");
    }
}
