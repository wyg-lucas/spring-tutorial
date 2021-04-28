import com.lucas.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date: 2021/4/20
 * @author: wangyg
 */

public class MyTest {
    @Test
    public void test(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        People person = context.getBean("person", People.class);
//        person.getCat().bark();
//        person.getDog().bark();
    
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People person = context.getBean("person2", People.class);
        person.getCat().bark();
        person.getDog().bark();
    }
}
