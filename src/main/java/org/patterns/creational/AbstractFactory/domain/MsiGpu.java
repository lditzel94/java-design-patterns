package org.patterns.creational.AbstractFactory.domain;

public class MsiGpu implements Gpu {
    @Override
    public void locateMemory() {
        System.out.println( "MSI locate memory" );
    }

    @Override
    public void assemble() {
        System.out.println( "MSI gpu assemble" );
    }
}
