package org.patterns.structural.Facade.services;

public class CryptoFactory {

    public static CryptoService getCryptoService( String currency ) {
        if ( currency.equals( "BTC" ) ) {
            return new BitcoinService();
        } else if ( currency.equals( "ETH" ) ) {
            return new EthereumService();
        } else {
            return new BitcoinService();
        }
    }
}
