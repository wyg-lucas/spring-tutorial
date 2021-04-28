package com.lucas.dao;

import com.lucas.pojo.User;

import java.util.List;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public interface UserMapper {
    List<User> getUserList();
}
