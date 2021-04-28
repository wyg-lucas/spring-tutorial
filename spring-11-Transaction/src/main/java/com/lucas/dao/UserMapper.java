package com.lucas.dao;

import com.lucas.pojo.User;

import java.util.List;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public interface UserMapper {
    
    List<User> getUserList();
    
    // 删除一个用户
    public int deleteUser(int id);
    
    // 插入一个用户
    public int addUser(User user);
}
