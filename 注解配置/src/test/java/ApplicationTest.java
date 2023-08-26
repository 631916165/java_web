import org.example.controller.StudentController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springzhujie.xml");
        StudentController studentController = context.getBean(StudentController.class);
        studentController.findAll();
    }
}
