package org.patterns.behavioral.ChainOfResponsibility.handler;

import org.patterns.behavioral.ChainOfResponsibility.Product;

public class BatchTester extends Tester {
    @Override
    public boolean validate( Product product ) {
        return product.batch() >= 1000 && product.batch() <= 2000
                ? nextValidationFor( product )
                : false;
    }
}
