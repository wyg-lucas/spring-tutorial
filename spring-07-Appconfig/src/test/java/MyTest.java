import com.lucas.config.LucasConfig;
import com.lucas.pojo.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @date: 2021/4/20
 * @author: wangyg
 */

public class MyTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LucasConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());


    }
}
