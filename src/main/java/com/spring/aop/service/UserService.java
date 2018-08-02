package com.spring.aop.service;

import com.spring.aop.bean.User;

/**
 * @Author: yhy
 * @Date: 2018/8/2 9:53
 * @Version 1.0
 */
public interface UserService {

    public User selectUserById(Integer integer);

    public void insertAndUpdateUser();

}
