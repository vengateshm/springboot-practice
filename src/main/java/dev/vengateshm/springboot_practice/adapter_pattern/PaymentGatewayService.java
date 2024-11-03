package dev.vengateshm.springboot_practice.adapter_pattern;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PaymentGatewayService {
    private Map<String, PaymentAdapter> paymentAdapterMap;

    public PaymentGatewayService(List<PaymentAdapter> paymentAdapterList) {
        paymentAdapterMap = paymentAdapterList.stream()
                .collect(Collectors.toMap(adapter -> adapter.getClass().getSimpleName(), Function.identity()));
    }

    public PaymentResponse processPayment(String gateway, PaymentRequest request) {
        PaymentAdapter paymentAdapter = paymentAdapterMap.get(gateway + "Adapter");
        paymentAdapter.makePayment(request.getAmount());
        return new PaymentResponse(true, new Random().nextLong(1000000000L));
    }
}
