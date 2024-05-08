package dev.vengateshm.springboot_practice.async;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderFulfillmentController {
    private final OrderFulfillmentService service;

    public OrderFulfillmentController(OrderFulfillmentService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<Order> processOrder(@RequestBody Order order) throws InterruptedException {
        service.processOrder(order);
        service.notifyUser(order);
        service.assignVendor(order);
        service.packaging(order);
        service.assignDeliveryPartner(order);
        service.assignTrailerAndDispatch(order);
        return ResponseEntity.of(Optional.of(order));
    }
}
