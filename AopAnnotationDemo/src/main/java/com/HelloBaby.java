package com;

import org.springframework.stereotype.Component;
//Component()括号里的也可以给组件命名，在getbean函数里根据组件名获取
//也可以不写组件名，默认的组件名为类名单词，开头单词字母小写，第二哥单词首字母大写
//默认采用的组件名采用驼峰命名法的。
@Component
public class HelloBaby {
    public void show(){
        System.out.println("angle baby!");
    }

}
