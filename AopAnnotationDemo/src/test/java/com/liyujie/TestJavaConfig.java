package com.liyujie;

import com.liyujie.BillDao.BillDao;
import com.liyujie.config.SpringConfig;
import com.liyujie.service.BillService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfig {
    @Test
    public void m1(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Girl girl=ctx.getBean("girl",Girl.class);
        System.out.println(girl.getName());

    }
    @Test
    public void m2(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BillDao billDao=ctx.getBean("billDao",BillDao.class);

        BillService billService=ctx.getBean("billService",BillService.class);
        billService.setBillDao(billDao);
        billService.pay(23.56);
    }
    @Test
    public void m3(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BillService billService=ctx.getBean("billService",BillService.class);
        billService.pay(55.32);
    }
}
