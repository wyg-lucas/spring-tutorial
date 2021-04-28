package com.lucas.Log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @date: 2021/4/21
 * @author: wangyg
 */

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+ method.getName()+"方法，返回结果为："+returnValue);
    }
}
