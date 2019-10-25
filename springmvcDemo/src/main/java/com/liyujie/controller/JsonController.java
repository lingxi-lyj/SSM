package com.liyujie.controller;

import com.liyujie.pojo.User1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
@RestController//@RestController=@Controller+@ResponseBody,
// 它适用于不返回视图的Controller中。并且写了它，在方法前面就不用写@ResourcesBody（写了也无所谓）
@RequestMapping("/json")
public class JsonController {
    @RequestMapping("/m1")
    @ResponseBody//返回json数据必须呀加@ResourcesBody
    //@ResourcesBody这个注解它将知道现在返回的不是视图，它会将这个数据转换成json格式。
   public User1 m1(){
        User1 u=new User1();
        u.setName("xiaoxiao");
        u.setPwd("123456");
        return u;
    }
    @RequestMapping("/m2")
    @ResponseBody
    public Map<String,Object> m2(){
        Map<String,Object> map=new HashMap<>();
        map.put("name","小包");
        map.put("age",28);
        return map;
    }
    @RequestMapping("/m3")
//    @ResponseBody
    public User1[] m3(){
        User1 u=new User1("xiaoxioa","123456");
        User1 u2=new User1("huahua","654321");
        return new User1[]{u,u2};
    }
    //restController风格，不需要写@ResponseBody
    @RequestMapping("/m4")
    public List<User1> m4(){
    List<User1>list=new ArrayList<>();
        User1 u=new User1("xiaoxioa","123456");
        User1 u2=new User1("huahua","654321");
        list.add(u);
        list.add(u2);
        return list;
    }
    @RequestMapping("/m5")
    public List<Map<String,User1>> m5(){
        User1 u1=new User1("xiaoxioa","123456");
        User1 u2=new User1("huahua","654321");
        Map<String,User1> map=new HashMap<>();
        map.put("u1",u1);
        map.put("u2",u2);
        User1 u3=new User1("李明","1111");
        User1 u4=new User1("小红","2222");
        Map<String,User1> map2=new HashMap<>();
        map2.put("u1",u3);
        map2.put("u2",u4);
        List<Map<String,User1>> maps=new ArrayList<>();
        maps.add(map);
        maps.add(map2);
        return maps;
    }
}
