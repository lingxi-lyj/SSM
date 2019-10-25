package com.lyj.controller;

import com.lyj.pojo.User;
import com.lyj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    //注入userService
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(User user, HttpSession session){
        //这里可以重新创建一个 User user=userService.exits(user),也可以直接用原来的user=userService.exits(user);
        user=userService.get(user);
        System.out.println("login......");
        if (user!=null){
            //数据库检查
            System.out.println("userb不是空");
           session.setAttribute("SESSION_USER",user);
            return "user";
        }
        else {
            System.out.println("找不到页面。。。");
            return "redirect:/login.jsp";
            //假设登录成功，将user信息存储到会话里去，
        }
    }
    @RequestMapping("/delete/{username}")
    @ResponseBody
    public Map<String ,Integer> delete(@PathVariable("username") String username){
        System.out.println("delete.....");
        boolean flag=userService.delete(username);
        Map<String,Integer> map=new HashMap<>();
        int code=flag? 2000:2003;
        map.put("code",code);
        return map;
    }
}
