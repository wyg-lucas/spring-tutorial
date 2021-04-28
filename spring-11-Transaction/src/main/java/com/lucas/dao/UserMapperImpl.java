package com.lucas.dao;

import com.lucas.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @date: 2021/4/22
 * @author: wangyg
 * @description:
 */

public class UserMapperImpl implements UserMapper {
    
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getUserList() {
      return sqlSession.getMapper(UserMapper.class).getUserList();
      
    }
    
    @Override
    public int deleteUser(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUser(id);
    }
    
    @Override
    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }
}
