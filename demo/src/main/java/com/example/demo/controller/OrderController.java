package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final PaymentClient paymentClient;

    public OrderController(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @PostMapping
    public String placeOrder(@RequestParam String product, @RequestParam int amount) {

        String paymentResponse = paymentClient.makePayment(amount);

        return "Order placed for " + product + " | " + paymentResponse + " (via Feign Client)";
    }
}