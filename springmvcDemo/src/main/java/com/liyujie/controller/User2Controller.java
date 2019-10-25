package com.liyujie.controller;

import com.liyujie.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user2")
public class User2Controller {
    //就是在Controller里面的任意一个方法执行之前都会执行
//    @ModelAttribute
//    public User init(){
//        System.out.println("init....");
//        User u=new User();
//        u.setName("王菲");
//        return u;
//    }
    @ModelAttribute("user")
    public void init(Model model){
        System.out.println("init....");
        User user=new User();
        user.setName("王菲");
        model.addAttribute("user",user);
    }
//    @RequestMapping("/login")
//    public  String login(Model model){
//        System.out.println(model.containsAttribute("u"));//false
//        System.out.println(model.containsAttribute("user"));//true
//        System.out.println(model.containsAttribute("ugjkadh"));//false
//        return "msg";
//    }

    @RequestMapping("/login")
    //这种方式会直接去我们的模型中去找
    public  String login(@ModelAttribute User user){
        System.out.println(user.getName()+user.getPassword());
        return "msg";
    }

}
