package singelton.impl;

import singelton.Singelton;

import java.io.Serial;

public class SingleThreadSingletonSerializable implements Singelton {

    private static SingleThreadSingletonSerializable intance=null;
    private SingleThreadSingletonSerializable(){
    }
    private SingleThreadSingletonSerializable(int num){
        System.out.println(num);

    }
//    public SingleThreadSingleton(int num,String st){
//        System.out.println(num+" "+st);
//    }
    public int getInstanceHash(){
        return SingleThreadSingletonSerializable.intance.hashCode();
    }

    public void printHello(){
        System.out.println("Hello from Singleton "+this.getInstanceHash());
    }


    public static SingleThreadSingletonSerializable getInstance() throws Exception {
        try{
            if(SingleThreadSingletonSerializable.intance==null) {
                SingleThreadSingletonSerializable.intance = new SingleThreadSingletonSerializable();
            }
        }catch (Exception e){
            throw new Exception("Object can't be created");
        }
        return SingleThreadSingletonSerializable.intance;
    }

    @Serial
    public  Object readResolve() throws Exception {
        return getInstance();
    }
}
