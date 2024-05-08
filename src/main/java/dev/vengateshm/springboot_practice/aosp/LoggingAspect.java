package dev.vengateshm.springboot_practice.aosp;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
    @Before("execution(* dev.vengateshm.springboot_practice.aosp.service.CourseService.*(..))")
    public void beforeServiceMethods(JoinPoint joinPoint) throws JsonProcessingException {
        System.out.println("LoggingAspect: Before executing service method");
        log.info("@Before :: class name {}", joinPoint.getTarget());
    }

    @After("execution(* dev.vengateshm.springboot_practice.aosp.service.CourseService.*(..))")
    public void afterServiceMethods(JoinPoint joinPoint) throws JsonProcessingException {
        System.out.println("LoggingAspect: Before executing service method");
        log.info("@After :: class name {}", joinPoint.getTarget());
    }
}
