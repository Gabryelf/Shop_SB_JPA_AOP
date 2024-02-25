package com.example.reserveShop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class ActionLoggingAspect {

    private final Logger logger = Logger.getLogger(getClass().getName());

    @Before("execution(* com.example.webShop.*.*(..))")
    public void logAction(JoinPoint joinPoint) {
        logger.info("Action performed: " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning(pointcut = "execution(* com.example.webShop..*.*(..))", returning = "result")
    public void logActionResult(JoinPoint joinPoint, Object result) {
        logger.info("Action result: " + result);
    }
}

