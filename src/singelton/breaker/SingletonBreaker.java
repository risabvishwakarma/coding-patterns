package singelton.breaker;

import singelton.BestSingleton;
import singelton.Singelton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreaker  {

    public void reflection(Class<? extends Singelton> aClass) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
 

        Constructor<?>[] c=aClass.getDeclaredConstructors();
        c[0].setAccessible(true);

        Singelton obj3= (Singelton) c[0].newInstance();
        System.out.println(obj3.hashCode());
    }
    public void Serialization(Singelton object) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, FileNotFoundException {
            System.out.println(object.hashCode());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("singleton-obj.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);


            FileInputStream fileInputStream = new  FileInputStream("singleton-obj.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Singelton object1= (Singelton) objectInputStream.readObject();
            System.out.println(object1.hashCode());
            object1.printHello();

        }catch (Exception e){
            System.out.println(e);

        }

    }
    public void multithreadingSingleton(){
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    Singelton obj = MultiThreadSingleton.getInstance();
                    Singelton bs= BestSingleton.INSTANCE;
                    System.out.println(bs.hashCode());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    Singleton obj = MultiThreadSingleton.getInstance();
                    Singelton bs=BestSingleton.INSTANCE;
                    System.out.println(bs.hashCode());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        });

        thread1.start();
        thread2.start();

    }
}
