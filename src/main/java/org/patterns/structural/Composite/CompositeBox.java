package org.patterns.structural.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box {
    private final List<Box> children = new ArrayList<>();

    public CompositeBox( Box... boxes ) {
        children.addAll( Arrays.asList( boxes ) );
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
