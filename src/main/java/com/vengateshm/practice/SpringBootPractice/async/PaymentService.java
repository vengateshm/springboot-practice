package com.vengateshm.practice.SpringBootPractice.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentService {
    public void doPayment(Order order) throws InterruptedException {
        log.info("initiate payment for order " + order.getOrderId());
        Thread.sleep(2000L);
        log.info("completed payment for order " + order.getOrderId());
    }
}
