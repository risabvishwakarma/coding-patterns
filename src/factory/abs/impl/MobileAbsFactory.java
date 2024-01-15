package factory.abs.impl;

import factory.Computer;
import factory.abs.AbstractComputerFactory;
import factory.impl.Mobile;

public class MobileAbsFactory extends AbstractComputerFactory {
    @Override
    public Computer getInstance() {
        return new Mobile();
    }
}
