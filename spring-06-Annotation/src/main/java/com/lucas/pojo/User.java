package com.lucas.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @date: 2021/4/20
 * @author: wangyg
 */

//@Component等价于 <bean id="user" class="com.lucas.pojo.User"/>
@Component
@Scope
public class User {
    @Value("Lucas")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
