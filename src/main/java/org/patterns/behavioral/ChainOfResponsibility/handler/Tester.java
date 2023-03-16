package org.patterns.behavioral.ChainOfResponsibility.handler;

import org.patterns.behavioral.ChainOfResponsibility.Product;

import java.util.Optional;
import java.util.function.Function;

public abstract class Tester {
    private Tester nextTester;

    public abstract boolean validate( Product product );

    protected boolean nextValidationFor( Product product ) {
        return Optional.ofNullable( nextTester )
                       .map( validateFor( product ) )
                       .orElse( true );
    }

    public void setNextTester( Tester nextTester ) {
        this.nextTester = nextTester;
    }

    private static Function<Tester, Boolean> validateFor( Product product ) {
        return tester -> tester.validate( product );
    }
}
