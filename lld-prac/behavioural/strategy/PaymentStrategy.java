package org.behavioural.strategy;

public interface PaymentStrategy {
    public void processPayment();
}

class PayPalStrategy implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("processing payment with Paypal");
    }
}

class StripeStrategy implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("processing payment with Stripe");
    }
}

class UpiStrategy implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("processing payment with UPI");
    }
}

class CreditStrategy implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("processing payment with Credit Card");
    }
}
