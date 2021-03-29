package com.daba.logger;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// Will be invoked before the pointcut is invoked
public class BeforeLog implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "'s " + method.getName() + " is being executed.");
    }
}
