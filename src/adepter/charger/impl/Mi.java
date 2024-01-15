package adepter.charger.impl;

import adepter.charger.AndroidCharger;

public class Mi implements AndroidCharger {
    public Mi(){
        chargeAndroid();
    }
    @Override
    public void chargeAndroid() {
        System.out.println("Charge Android Mobile");
    }
}
