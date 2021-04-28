import com.lucas.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date: 2021/4/19
 * @author: wangyg
 */

public class MyTest {
    public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      User user1 = (User) context.getBean("user2");
      user1.show();


    }
}
