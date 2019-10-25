package com.liyujie.controller;

import com.liyujie.pojo.User1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/json2")
public class JsonController2 {
    //前台如何提交一个User对象给后台。

    //User user 入参只能处理表单提交的数据也就是form表单提交的数据。
    //如果要得到前台通过Ajax方式拼接的数据要使用@RequestBody
    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestBody User1 user){
        System.out.println(user.getName()+user.getPwd());
        return "msg";
    }
    //下面这种写法是针对form表单提交数据给后台。
    @RequestMapping("/add2")
    public String add2(User1 user1){
        System.out.println(user1.getName()+user1.getPwd());
        return "msg";
    }
    @RequestMapping("/addList")
    @ResponseBody
    public Map<String,Integer> add3(@RequestBody List<User1> list){
        System.out.println(list);
        Map<String,Integer> map=new HashMap<>();
        map.put("code",2000);
        return map;
    }
}
