package com.daba.logger;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

// Will be invoked after the pointcut is invoked
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "'s " + method.getName() + " is being executed with a return value of " + returnValue);
    }
}
