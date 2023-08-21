package org.example.feng.service.feng.diy;

import org.aspectj.apache.bcel.classfile.ConstantInvokeDynamic;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//第三种方式：使用注解方式实现aop
@Aspect
public class AnnotPointcut {

    @Before("execution(* org.example.feng.service.feng.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("====方法执行之前===");
    }

    @After("execution(* org.example.feng.service.feng.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("======方法执行之后=====");
    }

    @Around("execution(* org.example.feng.service.feng.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Signature signature = jp.getSignature();//获得签名
        System.out.println(signature);
//        执行方法
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);


    }
}
