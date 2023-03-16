package org.patterns.structural.Facade.services;

public class BitcoinService extends CryptoService {
    @Override
    public void buyCurrency( double amount ) {
        System.out.println( "Buying " + amount + " of Bitcoin..." );
    }
}
