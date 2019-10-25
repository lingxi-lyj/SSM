package com.liyujie.controller;

import com.liyujie.pojo.Orders;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @RequestMapping("/addOrder")
    //返回值类型为String，String就是逻辑视图的名称
    public String addOrders(Model model){
        List<Orders> list=new ArrayList<>();
        Orders o=new Orders();
        o.setId("1");
        o.setName("电饭煲");
        o.setTotal(33.33);
        Orders o2=new Orders();
        o2.setId("2");
        o2.setName("平底锅");
        o2.setTotal(566.3);
        list.add(o);
        list.add(o2);
        model.addAttribute("orders",list);
        return "orders";
    }
}
