package com.lyj.service.impl;

import com.lyj.mapper.UserMapper;
import com.lyj.pojo.User;
import com.lyj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//这里加了@Service("userService")也就实现了implements UserService 中的UserService。
@Service("userService")
public class UserServiceImpl implements UserService {
//注入mapper
    @Autowired
    private UserMapper userMapper;
    @Override
    public User get(User user) {
    //提前检查
       User u= userMapper.select(user);

        return u;
    }

    @Override
    public boolean delete(String username) {
        int row= userMapper.delete(username);
        return row==1?true:false;
    }
}
