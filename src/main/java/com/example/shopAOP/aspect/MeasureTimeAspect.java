package com.example.shopAOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Класс аспекта с измерением времени метода
 */

@Aspect
@Component
public class MeasureTimeAspect {

    @Around("execution(* com.example.shopAOP..*.*(..))")
    public Object measureTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        System.out.println("Method " + joinPoint.getSignature().getName() + " executed in " + (endTime - startTime) + "ms");

        return result;
    }
}

