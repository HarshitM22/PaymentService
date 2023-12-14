package com.example.paymentservice.Services;

import com.example.paymentservice.PaymentGateway.StripePaymentGateway;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private StripePaymentGateway stripePaymentGateway;
    private PaymentService(StripePaymentGateway stripePaymentGateway){
        this.stripePaymentGateway=stripePaymentGateway;
    }
    public String createPaymentLink(Long orderId) throws StripeException {
        return stripePaymentGateway.createPaymentLink(29900L);
    }
}
