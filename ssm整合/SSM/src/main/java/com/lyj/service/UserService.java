package com.lyj.service;

import com.lyj.pojo.User;

public interface UserService {
    /*
 根据user去数据库检查是否存在该用户。
  */
     User get(User user);
/*
根据用户名去删除用户
 */
    boolean delete(String username);
}
