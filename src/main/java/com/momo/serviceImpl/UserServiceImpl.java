package com.momo.serviceImpl;

import com.momo.dao.UserDao;
import com.momo.service.UserService;

public class UserServiceImpl implements UserService {
    // 1. 接口声明
    private UserDao userDao;

    // 2. 提供setter方法， 用于DI
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    // 3. 实现了UserServicce接口的addUser()方法
    @Override
    public void addUser() {
        //调用UserDao中的add()方法
        userDao.save();
        System.out.println("addUser()方法执行了");
    }
}
