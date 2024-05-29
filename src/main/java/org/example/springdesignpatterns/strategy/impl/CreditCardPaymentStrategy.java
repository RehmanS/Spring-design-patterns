package org.example.springdesignpatterns.strategy.impl;

import org.example.springdesignpatterns.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public String pay(String orderId, double amount, String paymentType) {
        return "Payment done with payment strategy for order " + orderId + " with payment type " + paymentType + " and amount " + amount;
    }

}
