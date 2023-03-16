package org.patterns.creational.AbstractFactory.factory;

import org.patterns.creational.AbstractFactory.domain.AsusGpu;
import org.patterns.creational.AbstractFactory.domain.AsusMonitor;
import org.patterns.creational.AbstractFactory.domain.Gpu;
import org.patterns.creational.AbstractFactory.domain.Monitor;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
