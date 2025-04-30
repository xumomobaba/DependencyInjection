package com.momo.daoImpl;

import com.momo.dao.UserDao;
import com.momo.service.UserService;

public class UserDaoImpl implements UserDao {
    // 注入对象
    private UserService userService;

    // Setter 方法用于 DI
    public void setUserService(UserService userService) {
        this.userService = userService;
        System.out.println("userService 已通过 Setter 方法注入");
    }

    @Override
    public void save() {
        System.out.println("save()方法执行了");
        if (userService != null) {
            userService.addUser();
        } else {
            System.out.println("userService 为 null，无法调用 addUser()");
        }
    }

    @Override
    public void add() {
        System.out.println("add()方法执行了");
    }
}