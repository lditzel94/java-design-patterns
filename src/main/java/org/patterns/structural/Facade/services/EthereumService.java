package org.patterns.structural.Facade.services;

public class EthereumService extends CryptoService {
    @Override
    public void buyCurrency( double amount ) {
        System.out.println( "Buying " + amount + " of Ethereum..." );
    }
}
