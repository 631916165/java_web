import org.example.controller.StudentController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ControllerTest {

    @Test
    public void testRun() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springioc.xml");
        StudentController studentController = context.getBean(StudentController.class);
        studentController.findAll();
    }
}
