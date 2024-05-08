package dev.vengateshm.springboot_practice.aosp;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogExecutionTimeTracker {
    @Around("@annotation(dev.vengateshm.springboot_practice.aosp.annotation.TrackExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long endTime = System.currentTimeMillis();
        log.info("method {} execution takes {} ms time to complete", pjp.getSignature(), endTime - startTime);
        return obj;
    }
}
