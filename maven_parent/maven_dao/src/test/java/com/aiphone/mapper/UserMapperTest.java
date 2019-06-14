package com.aiphone.mapper;

import com.aiphone.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @program: day0612
 * @description:
 * @author: 闫伟禄
 * @create: 2019-06-13 19:26
 **/
public class UserMapperTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext-dao.xml");
        UserMapper bean = applicationContext.getBean(UserMapper.class);
        User user = new User();
        user.setUsername("lisi");
        user.setPassword("123");
        User user1 = bean.findUser(user);
        System.out.println(user1);
    }
}