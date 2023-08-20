import org.example.dao.UserDaoMysqlImp;
import org.example.dao.UserSqlseverlmp;
import org.example.service.UserService;
import org.example.service.UserServicelmp;

import java.security.PublicKey;

public class MyTest {
    public static void main(String[] args) {
        //用户时机调用的是业务层，dao层他们不需要接触
        UserServicelmp userServicelmp = new UserServicelmp();
        userServicelmp.setUserDao(new UserSqlseverlmp());
        userServicelmp.getUser();

    }
}
