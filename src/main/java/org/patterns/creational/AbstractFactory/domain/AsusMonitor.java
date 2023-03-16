package org.patterns.creational.AbstractFactory.domain;

public class AsusMonitor implements Monitor {
    @Override
    public void adjustImage() {
        System.out.println( "Asus adjust" );
    }

    @Override
    public void assemble() {
        System.out.println( "Asus monitor assemble" );
    }
}
