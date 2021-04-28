package com.lucas.pojo;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}
