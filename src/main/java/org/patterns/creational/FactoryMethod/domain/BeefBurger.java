package org.patterns.creational.FactoryMethod;

public class BeefBurger implements Burger {

    @Override
    public void prepare() {
        // Prepare Beef Burger
        System.out.println( "Preparing Beef Burger..." );
    }
}
