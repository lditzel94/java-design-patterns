package org.patterns.structural.Flyweight;

public class BookType {
    private final String type;
    private final String distributor;
    private final String data;

    public BookType( String type, String distributor, String data ) {
        this.type = type;
        this.distributor = distributor;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getData() {
        return data;
    }
}
