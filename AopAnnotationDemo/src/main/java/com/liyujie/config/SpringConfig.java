package com.liyujie.config;

import com.liyujie.BillDao.BillDao;
import com.liyujie.Girl;
import com.liyujie.service.BillService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//：代表这个类是一个配置类。
@ComponentScan(value = "com.liyujie")//用来扫描指定包下面的注解类。
public class SpringConfig {
//    @Bean("girl")
//    public Girl CreateGirl(){
//        Girl girl=new Girl();
//        girl.setName("菲菲");
////        girl.getName("菲菲");
//        return girl;
//    }
//    @Bean("billService")
//    public BillService CreateBillService(){
//        BillService billService=new BillService();
//        return billService;
//    }
//    @Bean("billDao")
//    public BillDao CreateBillDao(){
//        BillDao billDao=new BillDao();
//        return  billDao;
//    }
}
