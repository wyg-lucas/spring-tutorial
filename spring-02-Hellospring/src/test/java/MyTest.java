import com.lucas.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date: 2021/4/19
 * @author: wangyg
 */

public class MyTest {
    public static void main(String[] args) {
        // 用XML加载必须写上ClassPathXmlApplicationContext
        // 获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
}
