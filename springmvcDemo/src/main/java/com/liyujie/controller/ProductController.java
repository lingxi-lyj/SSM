package com.liyujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/add/{id}/{name}/{price}")
//    @RequestMapping("/add/{id}/{name}/{price}")
    //以上两种方法都可以。
    public String get(@PathVariable("id") Integer id,@PathVariable("name") String name,@PathVariable("price") double price){
            System.out.println(id+name+price);
        return "forward";
    }
    @RequestMapping("/test")
    public String test(){
        System.out.println("test....");
        return "forward";
    }

}
