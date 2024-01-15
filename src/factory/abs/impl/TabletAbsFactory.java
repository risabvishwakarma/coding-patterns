package factory.abs.impl;

import factory.Computer;
import factory.abs.AbstractComputerFactory;
import factory.impl.Mobile;
import factory.impl.Tablet;

public class TabletAbsFactory extends AbstractComputerFactory {
    @Override
    public Computer getInstance() {
        return new Tablet();
    }
}
