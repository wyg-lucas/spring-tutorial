package com.lucas.config;

import com.lucas.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @date: 2021/4/20
 * @author: wangyg
 */

@Configuration
@Import(LucasConfig2.class)
public class LucasConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
