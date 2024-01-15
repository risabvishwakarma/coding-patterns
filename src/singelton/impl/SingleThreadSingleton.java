package singelton.impl;

import singelton.Singelton;

public class SingleThreadSingleton  implements Singelton {

    private static SingleThreadSingleton intance=null;
    private SingleThreadSingleton(){
    }
    private SingleThreadSingleton(int num){
        System.out.println(num);

    }
//    public SingleThreadSingleton(int num,String st){
//        System.out.println(num+" "+st);
//    }
    public int getInstanceHash(){
        return SingleThreadSingleton.intance.hashCode();
    }

    public void printHello(){
        System.out.println("Hello from Singleton "+this.getInstanceHash());
    }


    public static SingleThreadSingleton getInstance() throws Exception {
        try{
            if(SingleThreadSingleton.intance==null) {
                SingleThreadSingleton.intance = new SingleThreadSingleton();
            }
        }catch (Exception e){
            throw new Exception("Object can't be created");
        }
        return SingleThreadSingleton.intance;
    }
}
