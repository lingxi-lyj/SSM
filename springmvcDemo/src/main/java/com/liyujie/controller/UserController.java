package com.liyujie.controller;

import com.liyujie.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
//    @RequestMapping("/put")
//    @ResponseBody
//    public String put(@RequestParam("name") String name,@RequestParam("password") String password){//这里的形参要与form表单里的name值一致。
//        System.out.println(name+"\t"+password);
////        Map<String,String> map=new HashMap<>();
////        map.put("msg","ok");
//        return "ok";
//    }

    /*
    //如果这里@RequestMapping("/put")改为 @PostMapping("/put")
    则form表单里的<input type="hidden" name="_method" value="put">
   就可以删除掉了，不再使用。
     */
//    @RequestMapping("/put")
    @ResponseBody
    @PostMapping("/put")
    //需要额外的json.
    public String put(@ModelAttribute User user ){//这里的形参要与form表单里的name值一致。
        System.out.println(user.getName()+"\t"+user.getPassword());
        System.out.println(user.getBirth());
        return "ok";
    }
//    @InitBinder
//    public void initBinder(WebDataBinder binder){
//        //这里指定为什么格式，前端页面也只能传递什么格式，否则不行。
//        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy/MM/dd");
//        dateFormat.setLenient(false);
//        dateFormat2.setLenient(false);
//        binder.registerCustomEditor(Data.class,new CustomDateEditor(dateFormat,false));
//        binder.registerCustomEditor(Data.class,new CustomDateEditor(dateFormat2,false));
//    }

}
