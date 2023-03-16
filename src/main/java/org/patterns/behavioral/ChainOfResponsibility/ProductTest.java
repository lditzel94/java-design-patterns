package org.patterns.behavioral.ChainOfResponsibility;

import org.patterns.behavioral.ChainOfResponsibility.handler.Tester;

public class TestQuality {
    private Tester tester;

    public TestQuality( Tester tester ) {
        this.tester = tester;
    }

    public String validateQualityOf( Product product ) {
        return tester.validate( product ) ? "Aceptado" : "Rechazado";
    }
}
