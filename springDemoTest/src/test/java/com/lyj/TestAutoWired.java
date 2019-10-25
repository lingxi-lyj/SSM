package com.lyj;


import com.lyj.pojo.User;
import com.lyj.service.ProvideService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestAutoWired {
    @Test
    public void m1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("autowired.xml");
        User user = ctx.getBean("user", User.class);
        System.out.println(user.getPig().getName());
    }

    @Test
    public void m2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("autowired.xml");
        ProvideService provideService = ctx.getBean("provideService", ProvideService.class);
        provideService.update();
    }
}
