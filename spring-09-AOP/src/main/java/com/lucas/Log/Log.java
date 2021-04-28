package com.lucas.Log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class Log implements MethodBeforeAdvice {


    //method: 要执行的目标对象的方法
    //args: 参数
    //target: 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getSimpleName()+"的"+method.getName()+"方法被执行了 ");
    }
}
