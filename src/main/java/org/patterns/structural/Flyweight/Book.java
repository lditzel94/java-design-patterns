package org.patterns.structural.Flyweight;

public record Book(
        String name,
        double price,
        BookType type
) {
}
