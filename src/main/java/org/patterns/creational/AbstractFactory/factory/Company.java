package org.patterns.creational.AbstractFactory.factory;

import org.patterns.creational.AbstractFactory.domain.Gpu;
import org.patterns.creational.AbstractFactory.domain.Monitor;

public abstract class Company {
    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
