package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    //登录
    int selectUserByAccount(User user);
}
