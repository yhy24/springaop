package com.spring.aop.service.impl;

import com.spring.aop.bean.User;
import com.spring.aop.dao.UserDao;
import com.spring.aop.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: yhy
 * @Date: 2018/8/2 9:53
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService{
    final static Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    UserDao userDao;

    @Override
    public User selectUserById(Integer integer) {
        User user = userDao.selectUserById(integer);
        return user;
    }

//    @Transactional
    @Override
    public void insertAndUpdateUser() {

        SimpleDateFormat smp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = smp.format(new Date());
        User user = new User();
/*添加*/
        user.setAge(34);
        user.setCode("2");
        user.setGender("w");
        user.setUsername("迪丽热巴");
        user.setEmail("reba@qq.com");
        user.setCreate_date(format);

        int user1 = userDao.insertUser(user);
/*更新*/
        User user3 = new User();
        user3.setId(1);
        user3.setCode("5");
        logger.info("-------------"+user3.toString());
        int user2 = userDao.updateUser(user3);
    }

}
