package com.spring.aop.controller;

import com.spring.aop.bean.User;
import com.spring.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: yhy
 * @Date: 2018/8/2 9:54
 * @Version 1.0
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/login")
    public String testLogin() {
        return "login";
    }

    @RequestMapping("/select")
    @ResponseBody
    public String testUser() {
        System.out.println("-----------welcome----you-------");
        System.out.println("--------"+1+"------");
        User user = userService.selectUserById(1);
        System.out.println("---------"+user.toString()+"---------");
        return user.toString();
    }

    @RequestMapping("/op")
    @ResponseBody
    public String testInandU() {
        userService.insertAndUpdateUser();
        return "success";
    }


}
