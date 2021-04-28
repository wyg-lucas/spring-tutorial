package com.lucas.config;

import com.lucas.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @date: 2021/4/20
 * @author: wangyg
 */

@Configuration
public class LucasConfig2 {

    @Bean
    public User getUser(){
        return new User();
    }
}
