import com.lucas.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date: 2021/4/19
 * @author: wangyg
 */

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student3");
        System.out.println(student.getName());
        System.out.println(student);
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean("student2", Student.class);
        Student student2 = context.getBean("student2", Student.class);
        Student student3 = context.getBean("student", Student.class);
        Student student4 = context.getBean("student", Student.class);

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
    }

}
