package com.liyujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/baby")
public class BabyHello {
    @RequestMapping("/helloBaby")
    public String forward(){
        System.out.println("我是baby!");
        return "forward";
    }
}
