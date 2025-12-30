package org.example.Model;

public class Payment {
    private double amount;
    private PaymentStrategy paymentStrategy;

    public Payment(double amount1,PaymentStrategy strategy) {
        this.amount = amount1;
        this.paymentStrategy = strategy;
    }

    public void processPayment() {
        if(amount > 0)
            paymentStrategy.processPayment(amount);
        else
            System.out.println("Invalid amount given , please retry payment");
    }
}
