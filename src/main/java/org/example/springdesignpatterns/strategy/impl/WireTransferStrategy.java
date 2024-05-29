package org.example.springdesignpatterns.strategy.impl;

import org.example.springdesignpatterns.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("wireTransfer")
public class WireTransferStrategy implements PaymentStrategy {

    @Override
    public String pay(String orderId, double amount, String paymentType) {
        return "Payment done with wire transfer for order " + orderId + " with payment type " + paymentType + " and amount " + amount;
    }

}
