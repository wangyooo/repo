package com.huawei.learn.service;

import com.huawei.learn.dao.UserDao;
import com.huawei.learn.dao.UserDaoImp;

public class UserService {

    private UserDao userDao;

   /* public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("userService add.......");

        userDao.add();
    }
}
