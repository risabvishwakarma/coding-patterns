package factory.abs.impl;

import factory.Computer;
import factory.abs.AbstractComputerFactory;
import factory.impl.Laptop;
import factory.impl.Mobile;

public class LaptopAbsFactory extends AbstractComputerFactory {
    @Override
    public Computer getInstance() {
        return new Laptop();
    }
}
