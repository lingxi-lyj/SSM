package com.lyj.service;

import com.lyj.dao.ProvideDao;

public class ProvideService {
    private ProvideDao provideDao;
    public void update(){
        System.out.println("更新了供应商的信息Service。。。。");
        provideDao.update();
    }

    public ProvideDao getProvideDao() {
        return provideDao;
    }

    public void setProvideDao(ProvideDao provideDao) {
        this.provideDao = provideDao;
    }
}
