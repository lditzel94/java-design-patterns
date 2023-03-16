package org.patterns.behavioral.ChainOfResponsibility;

import org.patterns.behavioral.ChainOfResponsibility.handler.Tester;

public class ProductTest {
    private Tester tester;

    public ProductTest( Tester tester ) {
        this.tester = tester;
    }

    public String validateQualityOf( Product product ) {
        return tester.validate( product ) ? "Aceptado" : "Rechazado";
    }
}
