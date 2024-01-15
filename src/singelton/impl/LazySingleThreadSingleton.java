package singelton.impl;

import singelton.Singelton;

public class LazySingleThreadSingleton implements Singelton {

    private static LazySingleThreadSingleton intance=new LazySingleThreadSingleton();
    private LazySingleThreadSingleton(){
    }
    public int getInstanceHash(){
        return LazySingleThreadSingleton.intance.hashCode();
    }
    public void printHello(){
        System.out.println("Hello from LazySingleton "+this.getInstanceHash());
    }
    public static LazySingleThreadSingleton getInstance() throws Exception {
        return LazySingleThreadSingleton.intance;
    }
}
