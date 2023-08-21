import org.example.feng.service.UserService;
import org.example.feng.service.UserServiceImpl;
import org.springframework.beans.factory.wiring.ClassNameBeanWiringInfoResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userservice");
        userService.add();
    }
}