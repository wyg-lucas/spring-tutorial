import com.lucas.dao.UserDaoImpl;
import com.lucas.dao.UserDaoMySQLImpl;
import com.lucas.dao.UserDaoOracleImpl;
import com.lucas.service.UserService;
import com.lucas.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.IntStream;

/**
 * @date: 2021/4/19
 * @author: wangyg
 */

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDaoMySQLImpl userDaoMySQL = (UserDaoMySQLImpl)context.getBean("mySQLImpl");
//        userDaoMySQL.getUser();
    
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.getUser();
    }
    
    @Test
    public void test(){
        
        int sum = IntStream.range(0, 10).reduce(0, (v1, v2) -> v1 + v2);
        System.out.println(sum);
        // 规约操作返回 optionalInt，不一定有值
        IntStream.range(0, 10).reduce((v1, v2) -> v1 + v2).ifPresent(System.out::println);
    }
    
    
}
