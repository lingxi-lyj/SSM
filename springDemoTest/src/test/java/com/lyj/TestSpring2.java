package com.lyj;

import com.lyj.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestSpring2 {
    @Test
    public void m1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("PeopleBeans.xml");
        People people = ctx.getBean(People.class);
        System.out.println(Arrays.toString(people.getFrends()));
        System.out.println(people.getFrends().length);
        System.out.println(people.getNums());
        System.out.println(people.getNums().size());
        System.out.println(people.getCats());
        System.out.println(people.getCats().size());
        System.out.println(people.getPigs());
        System.out.println(people.getPigs().size());
        System.out.println(people.getUserMap());
        System.out.println(people.getUserMap().size());
    }
}
