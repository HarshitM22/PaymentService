package com.example.paymentservice.PaymentGateway;

import com.stripe.exception.StripeException;

public interface PaymentGateway {
    String createPaymentLink(Long amount) throws StripeException;
}
