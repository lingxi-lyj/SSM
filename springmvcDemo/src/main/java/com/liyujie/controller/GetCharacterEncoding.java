package com.liyujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/*
检验get请求会不会乱码
 */
@Controller
public class GetCharacterEncoding {
    @RequestMapping("/get/{name}")
    public String getCharacterEncoding(@PathVariable String name){
        System.out.println(name);
        return "msg";
    }
}
