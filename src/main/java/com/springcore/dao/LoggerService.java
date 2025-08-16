package com.springcore.dao;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Log4j2
@Component
@Aspect
public class LoggerService {

    @Before("execution(* com.springcore.dao.UserDAOImpl.getUserById(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        log.info("Before executing method: " + methodName);
        if (args != null && args.length > 0) {
            log.info("With arguments: ");
            for (Object arg : args) {
                log.info(arg);
            }
        } else {
            log.info("No arguments passed.");
        }
        log.info("Logging before method execution completed.");
    }
}
