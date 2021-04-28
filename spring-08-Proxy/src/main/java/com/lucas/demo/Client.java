package com.lucas.demo;

import com.lucas.pojo.Proxy;
import com.lucas.service.UserService;
import com.lucas.service.UserServiceImpl;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理的角色，不是真实存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 设置要代理的对象
        pih.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.read();

    }
}
