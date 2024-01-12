import singelton.Singelton;
import singelton.breaker.SingeltonBreaker;
import singelton.impl.LazySingleThreadSingleton;
import singelton.impl.SingleThreadSingleton;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] arg) throws Exception {
        Singelton obj=SingleThreadSingleton.getInstance();


        SingeltonBreaker singeltonBreaker=new SingeltonBreaker();
        singeltonBreaker.reflction();

        if(obj instanceof SingleThreadSingleton){
            obj.printHello();
        }
        obj= LazySingleThreadSingleton.getInstance();

        if(obj instanceof LazySingleThreadSingleton){
            obj.printHello();
        }

    }
}
