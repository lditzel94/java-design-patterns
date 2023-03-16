package org.patterns.behavioral.Observer;

public record EmailListener( String email ) implements Listener {
    @Override
    public void update( Event eventType ) {
        System.out.println( "Sending email to " + email + " for " + eventType );
    }
}
