package org.example.springdesignpatterns.dto;

public record PaymentRequest(
        String orderId,
        Double amount,
        String paymentType
) {
}
