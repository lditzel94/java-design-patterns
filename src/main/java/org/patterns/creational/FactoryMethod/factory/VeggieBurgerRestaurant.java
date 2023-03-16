package org.patterns.creational.FactoryMethod.factory;

import org.patterns.creational.FactoryMethod.domain.Burger;
import org.patterns.creational.FactoryMethod.domain.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println( "Creating Veggie Burger..." );
        return new VeggieBurger();
    }
}
