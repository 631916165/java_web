import org.example.config.userconfig;
import org.example.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(userconfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
