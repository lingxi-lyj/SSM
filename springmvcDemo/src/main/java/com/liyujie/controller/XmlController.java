package com.liyujie.controller;

import com.liyujie.pojo.User1;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/xml")
public class XmlController {
    //描述生产类型，返回类型的描述，返回什么样的 数据。
    /*
    MediaType这个是spring里的不是其他的MediaType，
    produces ={MediaType.APPLICATION_XML_VALUE}是把数据转成xml数据与下面的它效果一样
    produces ={"application/xml"}。
    produces它是个数组类性的。
     */
    @RequestMapping(value = "/m1",produces ={MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public User1 m1(){
        //将数据转换成xml形式user
        User1 u=new User1("李明","123456");

        return u;
    }
}
