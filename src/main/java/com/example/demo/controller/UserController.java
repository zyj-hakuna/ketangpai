package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //登录，0表示未注册，1表示密码错误，2表示登录成功
    @RequestMapping(value = "/signIn")
    public int selectUser(@RequestBody User user){
        return userService.selectUserByAccount(user);
    }
}
