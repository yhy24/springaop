package com.spring.aop.dao;

import com.spring.aop.bean.User;

/**
 * @Author: yhy
 * @Date: 2018/8/2 9:53
 * @Version 1.0
 */
public interface UserDao {

    public User selectUserById(Integer id);


    public int insertUser(User user);

    public int updateUser(User user);


}
