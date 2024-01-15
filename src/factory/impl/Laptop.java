package factory.impl;

import factory.Computer;

public class Laptop implements Computer {
    @Override
    public void connectInternate() {
        System.out.println("Internate connected in laptop.");
    }

    @Override
    public void useInternate() {
        System.out.println("Done, but limited to 5G.");
    }

    @Override
    public void getScreenSize() {
        System.out.println("Wider screen size.");
    }
}
