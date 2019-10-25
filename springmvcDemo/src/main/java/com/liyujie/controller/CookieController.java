package com.liyujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")
public class CookieController {
    @RequestMapping("/c1")
    public String getcookie(@CookieValue("JSESSIONID") String jsessionid){
        System.out.println(jsessionid);
        return "msg";
    }
}
