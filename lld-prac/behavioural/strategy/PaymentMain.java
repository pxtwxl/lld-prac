package org.behavioural.strategy;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentStrategy paypal = new PayPalStrategy();
        PaymentStrategy credit = new CreditStrategy();
        PaymentStrategy upi = new UpiStrategy();
        PaymentStrategy stripe = new StripeStrategy();

        PaymentProcessor processor = new PaymentProcessor(paypal);
        processor.processPayment();

        processor.setPaymentStrategy(credit);
        processor.processPayment();

        processor.setPaymentStrategy(stripe);
        processor.processPayment();
    }
}
