package com.liyujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController2 {
    @RequestMapping("/forward")
    //转发
    public String forward(Model model){
        //springmvc model默认上在请求域当中存储值。
        System.out.println(111111);
        model.addAttribute("forard","请求转发");
        return "forward";
    }
    @RequestMapping("/redirect")
    //重定向--redirect是重定向的标志符。
    public String redirect(Model model){
        model.addAttribute("redirect","请求重定向");
        System.out.println(2222);
        //不带斜杠的写法是一个相对路径。根据当前上下文决定。hello
        //如果是重定向，就根据视图解析的规则无关。
        return "redirect:/jsp/redirect.jsp";
    }
    @RequestMapping("/forward2")
    public String forward2(){
        return "forward:/baby/helloBaby";
    }
}
