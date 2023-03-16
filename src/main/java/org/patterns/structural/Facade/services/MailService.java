package org.patterns.structural.Facade.services;

public class MailService {

    public static void sendConfirmationEmail( String email ) {
        System.out.println( "Sending email to " + email );
    }
}
