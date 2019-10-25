package com.liyujie.service;

import com.liyujie.BillDao.BillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    @Autowired//自动注入
    public BillDao billDao;

    public BillDao getBillDao() {
        return billDao;
    }

    public void setBillDao(BillDao billDao) {
        this.billDao = billDao;
    }
    public void pay(double money){
        System.out.println("Bill service pay");
        billDao.Pay(money);
    }
}
