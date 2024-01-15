package factory;

import factory.abs.AbstractComputerFactory;
import factory.impl.Laptop;
import factory.impl.Mobile;
import factory.impl.Tablet;

public class ComputerFactory {

    @Deprecated
    public static Computer getInstanceFromFactory(String type){
        return switch (type) {
            case "LAPTOP" -> new Laptop();
            case "MOBILE" -> new Mobile();
            case "TABLET" -> new Tablet();
            default -> null;
        };
    }
    public static Computer getInstanceFromFactory(AbstractComputerFactory abstractDevice){
        System.out.println(abstractDevice.getClass());
        return abstractDevice.getInstance();
    }
}
