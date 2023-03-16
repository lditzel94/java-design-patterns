package org.patterns.behavioral.Strategy.strategy;

public interface PaymentStrategy {
    void collectPaymentDetails();

    boolean validatePaymentDetails();

    void pay( int amount );
}
