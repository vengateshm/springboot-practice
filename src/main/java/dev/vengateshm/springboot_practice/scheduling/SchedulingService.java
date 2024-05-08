package dev.vengateshm.springboot_practice.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SchedulingService {
//    @Scheduled(fixedRate = 3_000)
//    @Scheduled(fixedDelay = 3_000, initialDelay = 5_000)
//    @Scheduled(cron = "0 22 16 * * MON-FRI")
    @Scheduled(cron = "${app.cron.value}")
    public void fixedRateScheduling() {
        log.info("Hi");
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
