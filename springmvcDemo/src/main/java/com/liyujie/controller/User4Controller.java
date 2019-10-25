package com.liyujie.controller;

import com.liyujie.constant.ResponseCode;
import com.liyujie.pojo.User1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user4")
public class User4Controller {
    @RequestMapping("/checkname")
    @ResponseBody
    public Map<String,Integer> register(@RequestBody User1 user1){
        Map<String,Integer> map=new HashMap<>();
        int code=ResponseCode.HAS_CODE;//400代表不可用，code的规则是可以自己定的.
        if (!user1.getName().equals("王菲")){
            code=ResponseCode.CAN_CODE;
        }
        map.put("code",code);
        return map;
    }
}
