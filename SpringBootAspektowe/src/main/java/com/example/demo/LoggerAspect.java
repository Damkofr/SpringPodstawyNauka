package com.example.demo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
    @Before("execution(* com.example.demo.BookRepository.*(..))")
    public void logInfoBefore() {
        System.out.println("Log before ");
    }

    @After("execution(* com.example.demo.BookRepository.*(..))")
    public void logInfoAfter() {
        System.out.println("Method executed ");
    }

    @AfterThrowing("execution(* com.example.demo.BookRepository.*(..))")
    public void logError() {
        System.out.println("Method finished with error ");
    }

    @AfterReturning("execution(* com.example.demo.BookRepository.*(..))")
    public void logSuccess() {
        System.out.println("Method successfully returned");
    }
}
