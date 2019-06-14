package com.aiphone.service.impl;

import com.aiphone.pojo.User;
import com.aiphone.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @program: day0612
 * @description:
 * @author: 闫伟禄
 * @create: 2019-06-13 21:34
 **/
public class UserServiceImplTest {

    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
        UserService bean = app.getBean(UserService.class);
        User user = new User();
        user.setUsername("lisi");
        user.setPassword("123");
        bean.login(user);
    }
}