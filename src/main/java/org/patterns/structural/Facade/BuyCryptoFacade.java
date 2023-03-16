package org.patterns.structural.Facade;

import org.patterns.structural.Facade.services.CryptoFactory;
import org.patterns.structural.Facade.services.MailService;

public class BuyCryptoFacade {

    public void buyCryptocurrency( double amount, String currency ) {
        CryptoFactory.getCryptoService( currency )
                     .buyCurrency( amount );
        MailService.sendConfirmationEmail( "luciano@redbee.com" );
    }
}
