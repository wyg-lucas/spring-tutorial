import com.lucas.dao.UserMapperImpl2;
import com.lucas.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @date: 2021/4/22
 * @author: wangyg
 * @description:
 */

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl2 userMapper2 = context.getBean("userMapper2", UserMapperImpl2.class);
        List<User> userList = userMapper2.getUserList();

        for (User user : userList){
            System.out.println(user);
        }
        
    }
}
