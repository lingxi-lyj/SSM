package com.lyj;

import com.lyj.interfac.Pay;
import com.lyj.pojo.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
/*
测试从容器中获取对象，想要什么对象只需要去spring容器里去拿，不需要去new一个对象
 */
    @Test
    public void m1() {
//      1.  获取上下文对象，spring里声明的对象都需要通过上下文对象获取
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        2.通过这个对象获取gril
        Gril gril = (Gril) ctx.getBean("gril");
//        进行转型
        ((PrettyGril) gril).show();
        System.out.println(gril);
    }
    /*
    测试依赖注入的方法，
     */
    @Test
    public void m2() {
//      1.  获取上下文对象，spring里声明的对象都需要通过上下文对象获取
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        这种行为称之为依赖，依赖某个对象，某 个接口，某个方法
        Pay pay = (Pay) ctx.getBean("pay");
        pay.Pay();
    }
/*
测试实例化容器的时候，可以扫描读取多个<beans>配置文件
 */
    @Test
    public void m3() {
//      1.  获取上下文对象，扫描读取多个配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","beans1.xml","beans2.xml"});
        //以下方式一方式二获取的对象是同一个对象，只不过一个是通过强转，一个是通过指定Class类型
//        方式一：需要强转
        Gril gril = (Gril) ctx.getBean("gril");
        System.out.println(gril);
//        方式二：不需要强转
        Gril gril1l=ctx.getBean("gril",PrettyGril.class);
        System.out.println(gril1l);
//        ((PrettyGril) gril).show();
        Gril gril1= (Gril) ctx.getBean("yourGril");
        System.out.println(gril1);
        System.out.println(gril1.getName()+""+gril1.getAge());
        Gril gril11=ctx.getBean("yourGril",Gril.class);
        System.out.println(gril11);
        System.out.println(gril1.getName()+""+gril1.getAge());
//        ((PrettyGril)gril1).show();
        Gril gril2= (Gril) ctx.getBean("myGril");
        System.out.println(gril2);
//        ((PrettyGril)gril2).show();

//
    }
    /*
    测试bean中的方法
     */
    @Test
    public void m4(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","beans1.xml","beans2.xml"});
//        抽象bean不能被实例化
//        BadGril badGril=ctx.getBean("badGril",BadGril.class);
//        System.out.println(badGril);
        System.out.println("......");
        Gril gril=ctx.getBean("yourGril",Gril.class);
        System.out.println(gril.getName());
//        采用bean的id指定的别名获取的，bean里标签里设置的别名
        Gril g=ctx.getBean("g",Gril.class);
//        Gril gril2=ctx.getBean("g1",Gril.class);
        System.out.println(g.getName());
//        System.out.println(gril2.getName());
        //销毁容器
//        ((ClassPathXmlApplicationContext) ctx).close();
        //刷新容器
//        ((ClassPathXmlApplicationContext) ctx).refresh();
//        过时的摧毁容器
        ((ClassPathXmlApplicationContext) ctx).destroy();

    }
    /*
    测试bean的别名
     */
    @Test
    public void m5(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","beans1.xml","beans2.xml"});

        System.out.println("......");
        Gril gril=ctx.getBean("yourGril",Gril.class);
        System.out.println(gril.getName());
//        采用bean的id指定的别名获取的，bean里标签里设置的别名
        Gril g=ctx.getBean("g",Gril.class);
        Gril g1=ctx.getBean("g1",Gril.class);
        Gril g2=ctx.getBean("g2",Gril.class);
        System.out.println(g.getName());
        System.out.println(g1.getName());
        System.out.println(g2.getName());
        System.out.println(g);
        System.out.println(g1);

        ((ClassPathXmlApplicationContext) ctx).destroy();

    }
//    测试bean的scope属性
    @Test
    public void m6(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","beans1.xml","beans2.xml"});

        System.out.println("......");
        Gril gril=ctx.getBean("yourGril",Gril.class);
        System.out.println(gril.getName());
//        采用bean的id指定的别名获取的，bean里标签里设置的别名
        Gril g=ctx.getBean("g",Gril.class);
        Gril g1=ctx.getBean("g1",Gril.class);
        Gril g2=ctx.getBean("g2",Gril.class);
        System.out.println(g);
        System.out.println(g1);

        ((ClassPathXmlApplicationContext) ctx).destroy();

    }
    /*
    测试lazy-init延时
     */
    @Test
    public void m7(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans3.xml");
        System.out.println("......");
        //这个时候需要使用bean的时候才会初始化bean
        Gril gril=ctx.getBean("myGril",Gril.class);
        System.out.println(gril);
        ((ClassPathXmlApplicationContext) ctx).destroy();
    }
    /*
    测试depends-on属性
     */
    @Test
    public void m8(){
        ApplicationContext ctx=new  ClassPathXmlApplicationContext("beans3.xml");
        Gril gril=ctx.getBean("myGril",Gril.class);
        System.out.println(gril.getDog().getName());
    }
    /*
    测试alias属性，给bean的起别名
     */
    @Test
    public void m9(){
        ApplicationContext ctx=new  ClassPathXmlApplicationContext("beans3.xml");
        //者也是一种获取对象的方式，通过类对象进行获取,这种方式容器里只能有一个对象才可以使用，否则不可以使用
        Dog bean = ctx.getBean(Dog.class);
        Dog dog=ctx.getBean("goodDog",Dog.class);
        System.out.println(dog);
        System.out.println(bean);
    }
    /*
    构造注入测试
     */
    @Test
    public void m10(){
        ApplicationContext ctx=new  ClassPathXmlApplicationContext("beans3.xml");
        Dog dog=ctx.getBean("dog2",Dog.class);
        System.out.println(dog.getName());
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car);
    }
}
