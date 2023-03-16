package org.patterns.creational.AbstractFactory.domain;

public class MsiMonitor implements Monitor {
    @Override
    public void adjustImage() {
        System.out.println( "MSI Adjust" );
    }

    @Override
    public void assemble() {
        System.out.println( "MSI monitor assemble" );
    }
}
