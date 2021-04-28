package com.lucas.service;

import com.lucas.dao.UserDao;
import com.lucas.dao.UserDaoImpl;
import com.lucas.dao.UserDaoMySQLImpl;
import com.lucas.dao.UserDaoOracleImpl;

/**
 * @date: 2021/4/19
 * @author: wangyg
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;


    public void setUserDao(UserDao ud){
        this.userDao = ud;
    }

    @Override
    public void getUser(){
        userDao.getUser();

    }


}
