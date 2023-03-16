package org.patterns.creational.Singleton;

public class SingletonPattern {
    private static SingletonPattern instance;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        if ( instance == null ) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}
