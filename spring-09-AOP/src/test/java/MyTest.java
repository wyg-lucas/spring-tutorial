import com.lucas.service.UserService;
import com.lucas.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.create();
        userService.read();
        userService.update();
        userService.delete();
    }
}
