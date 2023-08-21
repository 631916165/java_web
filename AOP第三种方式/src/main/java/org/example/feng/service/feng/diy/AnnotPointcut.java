package org.example.feng.service.feng.diy;

import org.aspectj.apache.bcel.classfile.ConstantInvokeDynamic;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//第三种方式：使用注解方式实现aop
@Aspect
public class AnnotPointcut {

    @Before("execution(* org.example.feng.service.feng.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("====方法执行之前===");
    }
}
