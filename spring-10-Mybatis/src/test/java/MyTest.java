import com.lucas.dao.UserMapper;
import com.lucas.pojo.User;
import com.lucas.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class MyTest {

    @Test
    public void test(){

        SqlSession sqlSession = MybatisUtils.getSqlsession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserList();

        for (User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
    
    // Spring接收管理Mybatis
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        for (User user : mapper.getUserList()){
            System.out.println(user);
        }
    }
}
