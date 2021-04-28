package com.lucas.dao;

/**
 * @date: 2021/4/19
 * @author: wangyg
 */

public class UserDaoOracleImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("Oracle默认获取数据");
    }
}
