import adepter.ChargerAdepter;
import adepter.IPhone;
import adepter.charger.AndroidCharger;
import adepter.charger.IphoneCharger;
import adepter.charger.impl.Apple;
import adepter.charger.impl.Mi;
import builder.User;
import factory.ComputerFactory;
import factory.Computer;
import factory.abs.impl.LaptopAbsFactory;
import factory.abs.impl.MobileAbsFactory;
import factory.impl.Mobile;
import factory.impl.Tablet;
import prototype.NetworkConnection;
import proxy.ATM;
import singelton.BestSingleton;
import singelton.Singelton;
import singelton.breaker.SingletonBreaker;
import singelton.impl.MultiThreadSingleton;

import java.security.Provider;
import tri.*;

public class Main {
    public static void main(String[] arg) throws Exception {
  /*      Singelton obj = MultiThreadSingleton.getInstance();
        Singelton bs= BestSingleton.INSTANCE;

        SingletonBreaker singletonBreaker = new SingletonBreaker();
        singletonBreaker.multithreadingSingleton();*/


        /*Factory pattern*/

/*        Computer device= ComputerFactory.getInstanceFromFactory("TABLET");
//        device= ComputerFactory.getInstanceFromFactory(new MobileAbsFactory());
        if(device instanceof Tablet){
            ((Tablet)device).calling();}*/

       /* NetworkConnection networkConnection=new NetworkConnection("192.12.32.16");
        System.out.println(networkConnection.toString());

        try{
            NetworkConnection networkConnection2= (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection.hashCode());

        }catch (Exception e){
            e.printStackTrace();

        }*/
//
//        Provider.Service service =Service.INSTANCE;
//        service.insertWord("risab");
//        service.insertWord("risabkumar");
//        service.insertWord("risabkumar");
//        service.insertWord("regerg");
//
//
//
//
//
//        service.countTheWords();

       /* Trie trie=new Trie();
        trie.insertWord("risab");
        trie.countTheWords();*/

/*        IPhone ip=new IPhone();
//        IphoneCharger ipc=new Apple();
        AndroidCharger ac=new Mi();

        ip.insertCharger(new ChargerAdepter(ac));*/

       /* User user=new User.UserBuilder().setUser("risabvishwakarma")
                .setEmail("risab.7088@gmail.com")
                .setPhone("7088557455")
                .build();
        System.out.println(user.toString());*/

        ATM atm=new ATM();
        atm.accessAccount();
        atm.deposit();





    }
}