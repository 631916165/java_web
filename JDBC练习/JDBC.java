package book.manage.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
使用databases.txt去创建数据库练习
* 使用JDBC
* 1.注册驱动
* 2.获取连接connection
* 3.得到执行sql语句的对象statement
* 4.执行sql语句，返回结果
* 5.处理结果
* 关闭connection
* */
public class stufyJava {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lianxi","root","123456");
        //得到执行sql语句的对象
        Statement stmt = conn.createStatement();
        //执行sql语句，返回结果
        ResultSet rs = stmt.executeQuery("select id,name,password,email,birthday from t_user");
//        System.out.println(rs.getObject("id"));

        //处理结果
        while (rs.next()) {
            System.out.println(rs.getObject("id"));
            System.out.println(rs.getObject("name"));
            System.out.println(rs.getObject("password"));
            System.out.println(rs.getObject("email"));
            System.out.println(rs.getObject("birthday"));
        }

        //关闭资源
        rs.close();
        stmt.close();
        conn.close();
    }
}
