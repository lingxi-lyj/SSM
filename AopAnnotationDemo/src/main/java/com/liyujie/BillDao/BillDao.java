package com.liyujie.BillDao;

import org.springframework.stereotype.Repository;

@Repository
public class BillDao {
    public void Pay(double money) {
        System.out.println("Bill...");
        System.out.println("在支付："+money);
    }
}
