package com.example.paymentservice.Controller;

import com.example.paymentservice.Dtos.PaymentLinkRequestDTO;
import com.example.paymentservice.Services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/pay")
public class PaymentController {
    private PaymentService paymentService;
    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    @PostMapping("/")
    private String createPaymentLink(@RequestBody PaymentLinkRequestDTO paymentLinkRequestDTO) throws StripeException {
        return paymentService.createPaymentLink(paymentLinkRequestDTO.getOrderId());
    }
}
