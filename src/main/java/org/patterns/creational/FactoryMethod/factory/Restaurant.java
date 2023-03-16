package org.patterns.creational.FactoryMethod.factory;

import org.patterns.creational.FactoryMethod.domain.Burger;

public abstract class Restaurant {
    public void orderBurger() {
        System.out.println( "Ordering Burger..." );
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();
}
