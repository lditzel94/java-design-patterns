package org.patterns.creational.AbstractFactory.domain;

public class AsusGpu implements Gpu {
    @Override
    public void locateMemory() {
        System.out.println( "Asus locate memory" );
    }

    @Override
    public void assemble() {
        System.out.println( "Asus gpu assemble" );
    }
}
