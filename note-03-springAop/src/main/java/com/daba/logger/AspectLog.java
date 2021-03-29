package com.daba.logger;

public class AspectLog {
    public void before() {
        System.out.println("====== Before pointcut invocation ======");
    }

    public void after() {
        System.out.println("====== After pointcut invocation ======");
    }
}
