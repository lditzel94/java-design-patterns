package org.patterns.behavioral.ChainOfResponsibility.handler;

import org.patterns.behavioral.ChainOfResponsibility.Product;

public class PackagingTester extends Tester {
    @Override
    public boolean validate( Product product ) {
        return ( product.packaging() == "HEALTHY" || product.packaging() == "ALMOST_HEALTHY" )
                ? nextValidationFor( product )
                : false;
    }
}
