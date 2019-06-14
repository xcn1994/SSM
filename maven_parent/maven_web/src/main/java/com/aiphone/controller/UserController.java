package com.aiphone.controller;

import com.aiphone.pojo.User;
import com.aiphone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: day0612
 * @description:
 * @author: 闫伟禄
 * @create: 2019-06-13 21:39
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(User user){
        boolean login = userService.login(user);
        ModelAndView modelAndView = new ModelAndView();
        if (login) {
            modelAndView.addObject("user", user);
            modelAndView.setViewName("success");
        } else {
            modelAndView.addObject("msg", "用户名或密码错误");
            modelAndView.setViewName("forward:/login.jsp");
        }
        return modelAndView;
    }
}
