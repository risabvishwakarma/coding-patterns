package adepter.charger.impl;

import adepter.charger.IphoneCharger;

public class Apple implements IphoneCharger {

    public Apple(){
        chargeIphone();
    }
    @Override
    public void chargeIphone() {
        System.out.println("Apple charger");
    }
}
