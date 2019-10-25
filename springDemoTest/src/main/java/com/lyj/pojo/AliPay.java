package com.lyj.pojo;

import com.lyj.interfac.Pay;

public class AliPay implements Pay {
    @Override
    public void Pay() {
        System.out.println("支付宝支付！");
    }
}
