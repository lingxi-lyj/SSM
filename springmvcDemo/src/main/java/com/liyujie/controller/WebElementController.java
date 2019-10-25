package com.liyujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/web")
public class WebElementController {
    @RequestMapping("/request")
    //模拟请求
    public String request(WebRequest request){
        System.out.println(request.getParameter("girl"));
        return "forward";
    }
    @RequestMapping("/request2")
    public String request(HttpServletRequest request){
        System.out.println(request.getParameter("bay"));
        return "forward";
    }
    @RequestMapping("/request3")
    public String request(HttpSession session){
        session.setAttribute("g","神庙逃亡");
        //这里的要显示“ctx内容，要先执行localhost:8080/c/jsp/redirect.jsp
        //再执行http://localhost:8080/c/ctx.jsp才能把ctx内容显示出来，并且要创建ctx.jsp，这里的XX.jsp,名字可以不是ctx
        session.getServletContext().setAttribute("context","宇宙我最帅！");
        return "redirect:/jsp/redirect.jsp";
    }
//    @RequestMapping(value = {"/m1","/m2"})
//@RequestMapping(path = {"/m1","/m2"})
    //请求映射的路径path可以有多个值,以上两种效果一样
    //如果没有使用method限定请求，它是啥请求都可以的。如果限定了请求，则页面请求必须是method指定的请求方式，否则报出405请求不符合指定的方式。
    @RequestMapping(path = {"/m1","/m2"},method =RequestMethod.GET )
    public String m(){
        System.out.println("m1....");
        return "forward";
    }
    //params代表我需要两个参数，一个girl，一个boy,
    //这里又指定了girl参数的值，只有符合girl的参数值才能访问此方法
    @RequestMapping(path = {"/m2"},params = {"girl=wangfei","boy"})
    public String m1(){
        System.out.println("m2....");
        return "forward";
    }
    //这里的path = {"/m3?"}代表的URI访问路径以m3+任意一个字符（"/"除外)即可。
    //例如：localhost:8080/c/web/m3*
//    @RequestMapping(path = {"/m3?"})
    /*path = {"/m3*"}代表的URI访问路径以m3+(0或者多个任意字符，不能含有"/")
    例如：http://localhost:8080/c/web/m3aa
     */
//    @RequestMapping(path = {"/m3*"})

    /*
    path = {"/m3/**"}代表支持任意层路径/m3/**这样才可以提现。
    例如：http://localhost:8080/c/web/m3/a/c/v
    /m3/**这样的效果等同于m3后面任意多个字符。
     */
//    @RequestMapping(path = {"/m3/**"})
    /* path = {"/m3/*"} 代表支持一层路径，不支持多层路径。
        例如：http://localhost:8080/c/web/m3/afadf
     */
    @RequestMapping(path = {"/m3/*"})
    public String m3(){
        System.out.println("m3....");
        return "forward";
    }
    //相当于requestmapping里的method指定为get请求
    @GetMapping(path = {"/m4"})
    public String m4(){
        System.out.println("m4....");
        return "forward";
    }
    //相当于requestmapping里的method指定为post请求
    @PostMapping(path = {"/m5"})
    public String m5(){
        System.out.println("m5....");
        return "forward";
    }
//    @RequestMapping(path = {"/m6"},method = RequestMethod.DELETE)
//    @ResponseBody
//    public String m6(){
//        System.out.println("m6....");
//        return "forward";
//    }
    @DeleteMapping(path = {"/m6"})
    @ResponseBody
    /*
    将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，
    写入到response对象的body区，通常用来返回JSON数据或者是XML
     */
    public String m6(){
        System.out.println("m6....");
        return "forward";
    }

}
