package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @PostMapping("/pay")
    public String makePayment(@RequestBody int amount) {
        return "Payment successful for amount: " + amount;
    }
}