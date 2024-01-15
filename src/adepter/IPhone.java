package adepter;

import adepter.charger.IphoneCharger;
import adepter.charger.impl.Apple;

public class IPhone  {
    IphoneCharger charger=null;
    public void insertCharger(IphoneCharger ipc){
        this.charger=ipc;
        chargeIphone();

    }
    public void clickPic(){
        System.out.println("Picture has clicked.");

    }


    private void chargeIphone() {
        System.out.println("Iphone is charging.");
    }
}
