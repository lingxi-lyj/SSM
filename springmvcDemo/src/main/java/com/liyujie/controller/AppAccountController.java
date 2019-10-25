package com.liyujie.controller;

import com.liyujie.pojo.AppAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/appAccount")
public class AppAccountController {
    @RequestMapping("/index")
    public String index(Model model){
        List<AppAccount> list=new ArrayList<>();
        AppAccount appAccount=new AppAccount(1,"102","小米手机真好");
        AppAccount appAccount1=new AppAccount(2,"103","华为手机真好");
        list.add(appAccount);
        list.add(appAccount1);
        model.addAttribute("appAcount",list);
        return "appAccount/index";
    }
}
