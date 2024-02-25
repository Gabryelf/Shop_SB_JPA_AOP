package com.example.webShop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class ExecutionTimeMeasurementAspect {

    private final Logger logger = Logger.getLogger(getClass().getName());

    @Around("execution(* com.example.webShop..*.*(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        logger.info("Method " + joinPoint.getSignature().toShortString() +
                " executed in " + executionTime + " ms");

        return result;
    }
}

