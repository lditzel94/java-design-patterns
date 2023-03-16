package org.patterns.creational.Singleton;

public class ConcurrentSingleton {
    private static volatile ConcurrentSingleton instance;

    private ConcurrentSingleton() {
    }

    public static ConcurrentSingleton getInstance() {
        ConcurrentSingleton result = instance;

        if ( result == null ) {
            synchronized ( ConcurrentSingleton.class ) {
                result = instance;
                if ( result == null ) {
                    instance = result = new ConcurrentSingleton();
                }
            }
        }
        return result;
    }
}
