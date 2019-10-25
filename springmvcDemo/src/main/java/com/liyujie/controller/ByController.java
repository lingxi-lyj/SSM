package com.liyujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//不雅继承任何类或者实现任何方法，没有强迫我。
@Controller
public class ByController {
    //ModelAndView = Model+View
    @RequestMapping("/bye")
    public String by(Model model){
        model.addAttribute("model","内容为modellor");
        //这里的return 的结果就是我们的viewName，
        //此时去的页面就是/jsp/bye.jsp页面。
        return "bye";
    }
    @RequestMapping("/goodbye")
    public String goodbye(Model model){
        model.addAttribute("boy","我是goodbye");
        return "bye";

    }
}
