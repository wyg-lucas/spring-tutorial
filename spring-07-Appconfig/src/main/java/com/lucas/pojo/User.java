package com.lucas.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @date: 2021/4/20
 * @author: wangyg
 */

@Component
public class User {

    private String name;


    public String getName() {
        return name;
    }

    @Value("Lucas")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
