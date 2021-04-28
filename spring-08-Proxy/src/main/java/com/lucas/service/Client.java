package com.lucas.service;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.read();

    }

}
