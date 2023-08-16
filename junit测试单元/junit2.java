package book.manage.study;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class stufyJava {

    //还可以使用@before和@after注解标记方法
    @Before
    public void beforetest1() {
        System.out.println("该方法会在test1方法之前执行");
    }

    @After
    public void aftertest1() {
        System.out.println("该方法会在test1方法之后执行");
    }

    @Test
    public void test1() {
        System.out.println("manage");
    }
}
