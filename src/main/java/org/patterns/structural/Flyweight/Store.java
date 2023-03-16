package org.patterns.structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Book> books = new ArrayList<>();

    public void storeBook( String name, double price, String type, String distributor, String data ) {
        BookType bookType = BookFlyweight.getBookType( type, distributor, data );
        books.add( new Book( name, price, bookType ) );
    }

    public void displayBooks() {
        books.forEach( System.out::println );
    }
}
