package org.patterns.behavioral.Observer;

public record MobileAppListener( String username ) implements Listener {
    @Override
    public void update( Event eventType ) {
        System.out.println( "Sending mobile app notification to " + username + " for " + eventType );
    }
}
