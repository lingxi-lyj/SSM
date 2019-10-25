package com.lyj.pojo;

import com.lyj.interfac.Pay;

public class WXPay implements Pay {
    @Override
    public void Pay() {
        System.out.println("微信支付");
    }
}
