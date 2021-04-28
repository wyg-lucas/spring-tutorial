package com.lucas.dao;

import com.lucas.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @date: 2021/4/22
 * @author: wangyg
 * @description:
 */

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    
    @Override
    public List<User> getUserList() {
        
        User newUser = new User(1,"小王","123");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(newUser);
        mapper.deleteUser(4);
        
        return mapper.getUserList();
    
    
    }
    
    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
    
    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }
}
