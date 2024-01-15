package adepter;

import adepter.charger.AndroidCharger;
import adepter.charger.IphoneCharger;

public class ChargerAdepter implements IphoneCharger {
    private AndroidCharger ac=null;
    public ChargerAdepter(AndroidCharger ac){
        this.ac=ac;
        chargeIphone();
    }
    @Override
    public void chargeIphone() {
        System.out.println("Apple charger");
    }

}
