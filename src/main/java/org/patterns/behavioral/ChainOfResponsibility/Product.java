package org.patterns.behavioral.ChainOfResponsibility;

public record Product(
        String name,
        Integer batch,
        Integer weight,
        String packaging
) {
}
