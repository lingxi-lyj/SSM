package com.liyujie.controller;

import com.liyujie.pojo.UserInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

//耗时拦截器测试
@Controller
@RequestMapping("/userInterceptor")

public class User5InterceptorController {
    @RequestMapping("/login")
    public String Login(UserInterceptor user, HttpSession session){
        System.out.println("login.....");
        //数据库检查
            session.setAttribute("SESSION_USER",user);

        //假设登录成功，将user信息存储到会话里去，
        return "userInterceptor";
    }
    @RequestMapping("/delete")
    public String delete(){
        System.out.println("delete.....");
        return "userInterceptor";
    }
}
