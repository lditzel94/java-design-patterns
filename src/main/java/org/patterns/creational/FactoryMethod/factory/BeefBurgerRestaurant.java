package org.patterns.creational.FactoryMethod.factory;

import org.patterns.creational.FactoryMethod.domain.BeefBurger;
import org.patterns.creational.FactoryMethod.domain.Burger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println( "Creating Beef Burger..." );
        return new BeefBurger();
    }
}
