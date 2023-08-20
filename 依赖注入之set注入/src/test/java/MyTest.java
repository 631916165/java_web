import org.example.pojp.Syudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Syudent syudent = (Syudent) context.getBean("student");
        System.out.println(syudent.toString());
    }
}

//    Syudent{name='张三', address=Address{address='西安'},
//    books=[西游记, 红楼梦, 三国演义, 水浒传],
//    hobby=[唱跳, rap],
//    card={学生卡=1236458684, 银行卡=41654165416},
//    games=[英雄联盟, 金铲铲],
//    wife='null',
//    info={姓名=王麻子, 学号=16546456}}