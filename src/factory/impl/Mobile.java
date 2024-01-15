package factory.impl;

import factory.Computer;
import factory.Features;

public class Mobile implements Features {
    @Override
    public void connectInternate() {
        System.out.println("Internate connected in mobile.");
    }

    @Override
    public void useInternate() {
        System.out.println("Done, but limited to 4G.");

    }

    @Override
    public void getScreenSize() {
        System.out.println("Smaller screen size.");
    }

    @Override
    public void calling(){
        System.out.println("You can call using VoLTE.");
    }
}
