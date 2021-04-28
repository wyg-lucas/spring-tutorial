package com.lucas.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.lucas.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("注解测试切面Before插入");
    }

    @After("execution(* com.lucas.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("注解测试切面After插入");
    }

    @Around("execution(* com.lucas.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable{
        
        System.out.println("环绕前");
        
        // 获得签名
        Signature signature = jp.getSignature();
        
        System.out.println("signature:" + signature);
        
        // 执行方法
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);

    }

}
