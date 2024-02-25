package com.example.shopAOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Класс аспекта с методом логирования
 */

@Aspect
@Component
public class LogAspect {

    @Before("execution(* com.example.shopAOP..*.*(..))")
    public void logAction() {
        System.out.println("Action performed");
    }
}
