package com.codetoday.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
@GetMapping("/orderServiceFallBack")
    public String orderServiceFallBack(){
        return "Order is down";
    }
    @GetMapping("/paymentServiceFallBack")
    public String paymentServiceFallBack(){
        return "Payment is down";
    }
    @GetMapping("/productServiceFallBack")
    public String productServiceFallBack(){
        return "Product is down";
    }
}
