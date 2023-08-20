package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoMysqlImp;
import org.example.dao.UserDaolmp;

public class UserServicelmp implements UserService{

    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
