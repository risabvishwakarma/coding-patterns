package singelton.impl;

import singelton.Singelton;

public class MultiThreadSingleton implements Singelton  {

    private static MultiThreadSingleton instance =null;
    private MultiThreadSingleton(){
        System.out.println("Instance created : "+this.hashCode());
    }
    private MultiThreadSingleton(int num){
        System.out.println(num);

    }
    public int getInstanceHash(){
        return MultiThreadSingleton.instance.hashCode();
    }

    public void printHello(){
        System.out.println("Hello from Singleton "+this.getInstanceHash());
    }


    public static MultiThreadSingleton getInstance() throws Exception {

        try{
            if(MultiThreadSingleton.instance ==null) {
                synchronized (MultiThreadSingleton.class) {
                    if(MultiThreadSingleton.instance ==null)MultiThreadSingleton.instance = new MultiThreadSingleton();
                }
            }
        }catch (Exception e){
            throw new Exception("Object can't be created");
        }
        return MultiThreadSingleton.instance;
    }
}
