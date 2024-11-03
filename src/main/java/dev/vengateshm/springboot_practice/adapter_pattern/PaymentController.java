package dev.vengateshm.springboot_practice.adapter_pattern;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {
    private final PaymentGatewayService paymentService;

    public PaymentController(PaymentGatewayService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<PaymentResponse> makePayment(
            @RequestBody PaymentRequest paymentRequest,
            @RequestParam(name = "mode") String gateway
    ) {
        return ResponseEntity.ok(paymentService.processPayment(gateway, paymentRequest));
    }
}
