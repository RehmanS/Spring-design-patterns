package org.example.springdesignpatterns.factory;

import org.example.springdesignpatterns.dto.PaymentRequest;

public interface PaymentFactory {

    String executePayment(PaymentRequest paymentRequest);
}
