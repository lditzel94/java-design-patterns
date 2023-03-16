package org.patterns.behavioral.ChainOfResponsibility.handler;

import org.patterns.behavioral.ChainOfResponsibility.Product;

public class WeightTester extends Tester {
    @Override
    public boolean validate( Product product ) {
        return product.weight() >= 1200 && product.weight() <= 1300
                ? nextValidationFor( product )
                : false;
    }
}
