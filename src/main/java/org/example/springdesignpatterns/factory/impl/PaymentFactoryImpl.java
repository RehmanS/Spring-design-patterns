package org.example.springdesignpatterns.factory.impl;

import lombok.RequiredArgsConstructor;
import org.example.springdesignpatterns.dto.PaymentRequest;
import org.example.springdesignpatterns.factory.PaymentFactory;
import org.example.springdesignpatterns.strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class PaymentFactoryImpl implements PaymentFactory {

    private final Map<String, PaymentStrategy> paymentStrategyMap;

    private PaymentStrategy getPaymentStrategy(String paymentType) {

        PaymentStrategy paymentStrategy = paymentStrategyMap.get(paymentType);
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Unknown payment type: " + paymentType);
        }

        return paymentStrategy;
    }

    @Override
    public String executePayment(PaymentRequest paymentRequest) {
        PaymentStrategy paymentStrategy = getPaymentStrategy(paymentRequest.paymentType());

        return paymentStrategy.pay(paymentRequest.orderId(), paymentRequest.amount(), paymentRequest.paymentType());
    }

}
