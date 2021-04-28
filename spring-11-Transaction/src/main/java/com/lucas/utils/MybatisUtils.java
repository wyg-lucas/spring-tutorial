package com.lucas.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {

        try{
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlsession(){
        return sqlSessionFactory.openSession();
    }

}
