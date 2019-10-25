package com.liyujie.controller;

import com.liyujie.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user3")
@SessionAttributes("user")
public class User3Controller {
    @ModelAttribute("user")
    public void init(Model model){
        System.out.println("init....");
        User user=new User();
        user.setName("王菲");
        model.addAttribute("user",user);
    }
    @RequestMapping("/login")
    public String login(@ModelAttribute User user){
        System.out.println(user.getName()+user.getPassword());
        return "redirect:/jsp/user.jsp";
    }

}
