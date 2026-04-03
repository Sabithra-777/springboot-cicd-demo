package com.example.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "payment-service", url = "http://localhost:8080")
public interface PaymentClient {

    @PostMapping("/pay")
    String makePayment(@RequestBody int amount);
}