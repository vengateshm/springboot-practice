package dev.vengateshm.springboot_practice.adapter_pattern;

import org.springframework.stereotype.Component;

@Component
public class StripeAdapter implements PaymentAdapter{
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid amount" + " " + amount + " " + "via Stripe");
    }
}
