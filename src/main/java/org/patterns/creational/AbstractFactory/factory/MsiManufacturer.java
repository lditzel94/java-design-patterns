package org.patterns.creational.AbstractFactory.factory;

import org.patterns.creational.AbstractFactory.domain.Gpu;
import org.patterns.creational.AbstractFactory.domain.Monitor;
import org.patterns.creational.AbstractFactory.domain.MsiGpu;
import org.patterns.creational.AbstractFactory.domain.MsiMonitor;

public class MsiManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
