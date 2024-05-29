package org.example.springdesignpatterns.strategy;

public interface PaymentStrategy {

    String pay(String orderId, double amount,String paymentType);
}
