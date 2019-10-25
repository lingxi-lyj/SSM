package com.lyj.mapper;

import com.lyj.pojo.User;

public interface UserMapper {
    User select(User user);


    int delete(String username);
}
