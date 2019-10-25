package com.liyujie.springtest;

import com.liyujie.springtest.pojo.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void m1(){
        //获取上下文对象，spring里面声明的对象都需要通过上下文来获取。
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过这个上下文对象来获取我们的girl。
        Girl g= (Girl) ctx.getBean("girl");
        System.out.println(g);
        //向下转型
        ((PrettyGirl)g).show();

    }
    @Test
    public void m2(){
        //获取上下文对象，spring里面声明的对象都需要通过上下文来获取。
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pay pay=(Pay)ctx.getBean("pay");
        Pay pay=(Pay)ctx.getBean("pay");
        pay.pay();
        //这里指定了类型，不需要进行强制转换。
        Pay pay1=ctx.getBean("pay",AliPay.class);
        pay1.pay();
    }
    @Test
    public void m3(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"bean1.xml","bean2.xml"});
        Girl g=ctx.getBean("myGirl",Girl.class);
//        Girl g1=ctx.getBean("hisGirl",Girl.class);
        Girl g2=ctx.getBean("yourGirl",Girl.class);
//        Girl g2=ctx.getBean("yougirl",Girl.class);//这里的yougirl 是bean里配置的name名字，也可以使用id进行.

        System.out.println(g.getName());
        System.out.println(g2.getName()+"\t"+g2.getAge());

        //销毁任务即销毁对象。
//        ((ClassPathXmlApplicationContext) ctx).close();//销毁
//        ((ClassPathXmlApplicationContext) ctx).refresh();//刷新
        ((ClassPathXmlApplicationContext) ctx).destroy();//过时的，淘汰的，只会警示，但不会报错。
    }
    @Test
    public void m4(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"bean1.xml","bean2.xml"});

//        Girl g1=ctx.getBean("hisGirl",Girl.class);
        Girl g=ctx.getBean("yourGirl",Girl.class);
        Girl g1=ctx.getBean("g",Girl.class);
        Girl g2=ctx.getBean("yg1",Girl.class);

//        Girl g2=ctx.getBean("yougirl",Girl.class);//这里的yougirl 是bean里配置的name名字，也可以使用id进行.


        System.out.println(g.getName()+"\t"+g.getAge());
        System.out.println(g1.getName()+"\t"+g1.getAge());
        System.out.println(g2.getName()+"\t"+g2.getAge());
        System.out.println(g1==g2);

        //销毁任务即销毁对象。
//        ((ClassPathXmlApplicationContext) ctx).close();//销毁
//        ((ClassPathXmlApplicationContext) ctx).refresh();//刷新
        ((ClassPathXmlApplicationContext) ctx).destroy();//过时的，淘汰的，只会警示，但不会报错。
    }
    @Test
    public void m5(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"bean3.xml"});
         //获取实例girl，尝试去获取，此时lazy-init="true"，当我要你的时候，你还是要出来，不要你的时候你可以不存在。
            Girl girl=ctx.getBean("girl",Girl.class);
//        System.out.println(girl);
    }
    @Test
    public void m6(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"bean3.xml"});
        //获取实例girl，尝试去获取，此时lazy-init="true"，当我要你的时候，你还是要出来，不要你的时候你可以不存在。
//         Dog bean=ctx.getBean(Dog.class);

//        Dog bean=ctx.getBean(Dog.class);
//        这种方法获取bean实例，只适合bean配置文件里只有一个bean对象，即一只狗，两只狗bean就不能使用。
//         Girl girl=ctx.getBean(Girl.class);
         Dog bean=ctx.getBean("dog2",Dog.class);
        System.out.println(bean.getName());
//        System.out.println(girl.getDog().getName());
    }
    @Test
    public void m7(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext(new String []{"bean3.xml"});
//        Car car=ctx.getBean("car",Car.class);
        Car car3=ctx.getBean("car2",Car.class);
        System.out.println(car3);
//        System.out.println(car);
    }
}
