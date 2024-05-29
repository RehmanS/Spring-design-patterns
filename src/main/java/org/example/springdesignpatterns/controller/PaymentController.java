package org.example.springdesignpatterns.controller;

import lombok.RequiredArgsConstructor;
import org.example.springdesignpatterns.dto.PaymentRequest;
import org.example.springdesignpatterns.factory.PaymentFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/payment")
public class PaymentController {

    private final PaymentFactory paymentFactory;

    @PostMapping
    public ResponseEntity<String> payment(@RequestBody PaymentRequest paymentRequest){
        return ResponseEntity.ok(paymentFactory.executePayment(paymentRequest));
    }

}
