package com.aiphone.service;

import com.aiphone.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @program: day0612
 * @description:
 * @author: 闫伟禄
 * @create: 2019-06-13 20:43
 **/
@Service("userService")
public interface UserService {
    boolean login(User user);
}
