package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceBean implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int selectUserByAccount(User user) {
        String account=user.getAccount();
        String password=user.getPassword();
        if (userMapper.selectUserByAccount(account)!=null){
            if (!userMapper.selectUserByAccount(account).getPassword().equals(password)){
                return 1;
            }else {
                return 2;
            }
        }else {
            return 0;
        }
    }
}
