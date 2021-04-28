package com.lucas.service;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class UserServiceImpl implements UserService {
    @Override
    public void create() {
        System.out.println("增");
    }

    @Override
    public void read() {
        System.out.println("查");

    }

    @Override
    public void update() {
        System.out.println("改");

    }

    @Override
    public void delete() {
        System.out.println("删");

    }
}
