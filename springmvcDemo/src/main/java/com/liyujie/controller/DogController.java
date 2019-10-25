package com.liyujie.controller;

import com.liyujie.pojo.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/dog")
@SessionAttributes("dog")
public class DogController {

    @RequestMapping("/regeister")
    public String doglogin(Dog dog){
        return "dog";
    }
    @RequestMapping("/login")
    //检查当前会话里是否有Dog
    public String login(@SessionAttribute Dog dog){
        System.out.println(dog.getName());
        return "redirect:/jsp/dog.jsp";

    }
}
