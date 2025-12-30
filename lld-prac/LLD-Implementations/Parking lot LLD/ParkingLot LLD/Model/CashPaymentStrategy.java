package org.example.Model;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Using cash mode for the payment");
//        cash payment logic here
    }
}
