package factory.impl;

import factory.Computer;
import factory.Features;

public class Tablet implements Features {
    @Override
    public void connectInternate() {
        System.out.println("Internate connected to Tablet.");

    }

    @Override
    public void useInternate() {
        System.out.println("Done, but limited to 4.5G.");

    }

    @Override
    public void getScreenSize() {
        System.out.println("Medium screen size.");
    }

    @Override
    public void calling(){
        System.out.println("You can call using VoLTE.");
    }
}
