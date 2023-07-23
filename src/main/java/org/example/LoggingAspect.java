package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @AfterReturning(pointcut = "execution(* org.example.vehicle.*.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.printf("method %s, retured: %s\n", methodName,result);
    }
}
