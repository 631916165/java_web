package book.manage.study;

import org.junit.Test;

/*
junit单元测试的使用
注:在@test注释修饰的测试方法中不能有返回值，不能有方法参数，不能使用static修饰，必须用public修饰
这里的test注解使用了maven引入详细见maven.txt
 */
public class stufyJava {
    
    @Test
    public void test1() {
        System.out.println("manage");
    }
}