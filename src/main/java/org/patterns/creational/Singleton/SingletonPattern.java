package org.patterns.creational;

public class SingletonPattern {
    private static volatile SingletonPattern instance;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        SingletonPattern result = instance;

        if ( result == null ) {
            synchronized ( SingletonPattern.class ) {
                result = instance;
                if ( result == null ) {
                    instance = result = new SingletonPattern();
                }
            }
        }
        return result;
    }
}
