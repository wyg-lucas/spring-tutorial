package com.lucas.service;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class UserServiceProxy implements UserService{

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void create(){
        log("create");
        userService.create();
    }

    public void read(){
        log("read");
        userService.read();
    }

    public void update(){
        log("update");
        userService.update();
    }

    public void delete(){
        log("delete");
        userService.delete();
    }

    public void log(String msg){
        System.out.println("使用了" + msg + "方法");

    }
}
