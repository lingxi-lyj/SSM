package com.liyujie.SpringAOP;

import com.liyujie.SpringAOP.advice.BeforeAdvice;
import com.liyujie.SpringAOP.service.HelloService;
import com.liyujie.SpringAOP.service.PrevideServeice;
import com.liyujie.SpringAOP.service.Privide;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
    @Test
    public  void m1(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("spring/applicationContext.xml");

//        如果不是spring容器所管理的bean，那么织入是无效的
//        PrevideServeice prevideServeice=new PrevideServeice();
//        prevideServeice.add();
        PrevideServeice prevideServeice=ctx.getBean("prevideServeice",PrevideServeice.class);
        prevideServeice.add();
    }
    @Test
    public void m2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        PrevideServeice prevideServeice=ctx.getBean("prevideServeice",PrevideServeice.class);
        prevideServeice.search(  "你好！",5);
    }
    @Test
    public void m3(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        Privide privide=new Privide();
        privide.setName("土豆");
        privide.setPrice(33.0);
        PrevideServeice prevideServeice=ctx.getBean("prevideServeice",PrevideServeice.class);
        prevideServeice.add(privide);
    }
    @Test
    public void  m4(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        PrevideServeice prevideServeice=ctx.getBean("prevideServeice",PrevideServeice.class);
        prevideServeice.search("toupixie");
    }
    @Test
    public void m5(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        HelloService helloService=ctx.getBean("helloService",HelloService.class);
        helloService.msg();
//        helloService.exe();
    }
}
