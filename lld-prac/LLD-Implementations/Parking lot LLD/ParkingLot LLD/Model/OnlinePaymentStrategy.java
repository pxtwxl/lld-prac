package org.example.Model;

public class OnlinePaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Using online mode for the payment");
//        online payment logic here
    }
}
