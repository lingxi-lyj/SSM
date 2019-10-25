import com.HelloBaby;
import com.liyujie.GoodBaby;
import com.liyujie.SpringAOPAnnotation.service.BadBaby;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
    @Test
    public void m1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        HelloBaby helloBaby=ctx.getBean("helloBaby",HelloBaby.class);
        GoodBaby goodBaby=ctx.getBean("goodBaby",GoodBaby.class);
        BadBaby badBaby=ctx.getBean("badBaby",BadBaby.class);

        helloBaby.show();
        goodBaby.show();
        badBaby.show();
    }
    @Test
    public void m2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        BadBaby badBaby=ctx.getBean("badBaby",BadBaby.class);
//        badBaby.eat("苹果");
//        badBaby.star();
//        badBaby.throwing();
        badBaby.round();
    }
    @Test
    public void m3(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }
}
