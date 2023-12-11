package com.vengateshm.practice.SpringBootPractice.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class OrderFulfillmentService {

    private InventoryService inventoryService;
    private PaymentService paymentService;

    public OrderFulfillmentService(InventoryService inventoryService, PaymentService paymentService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
    }

    public Order processOrder(Order order) throws InterruptedException {
        order.setTrackingId(UUID.randomUUID().toString());
        if (inventoryService.checkProductAvailability(order.getProductId())) {
            paymentService.doPayment(order);
        } else {
            throw new RuntimeException("Technical issue. Please try again.");
        }
        return order;
    }

    @Async("asyncTaskExecutor")
    public void notifyUser(Order order) throws InterruptedException {
        Thread.sleep(4000L);
        log.info("Notified the user " + Thread.currentThread().getName());
    }

    @Async("asyncTaskExecutor")
    public void assignVendor(Order order) throws InterruptedException {
        Thread.sleep(5000L);
        log.info("Assigned order to vendor " + Thread.currentThread().getName());
    }

    @Async("asyncTaskExecutor")
    public void packaging(Order order) throws InterruptedException {
        Thread.sleep(2000L);
        log.info("Order packaging completed " + Thread.currentThread().getName());
    }

    @Async("asyncTaskExecutor")
    public void assignDeliveryPartner(Order order) throws InterruptedException {
        Thread.sleep(10000L);
        log.info("Delivery partner assigned " + Thread.currentThread().getName());
    }

    @Async("asyncTaskExecutor")
    public void assignTrailerAndDispatch(Order order) throws InterruptedException {
        Thread.sleep(3000L);
        log.info("Trailer assigned and Order dispatched " + Thread.currentThread().getName());
    }
}
