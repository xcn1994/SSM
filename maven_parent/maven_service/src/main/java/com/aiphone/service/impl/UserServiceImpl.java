package com.aiphone.service.impl;

import com.aiphone.mapper.UserMapper;
import com.aiphone.pojo.User;
import com.aiphone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: day0612
 * @description:
 * @author: 闫伟禄
 * @create: 2019-06-13 21:25
 **/

public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public boolean login(User user){
        User user1 = userMapper.findUser(user);
        if(user1 != null) {
            return true;
        } else {
            return false;
        }
    }
}
