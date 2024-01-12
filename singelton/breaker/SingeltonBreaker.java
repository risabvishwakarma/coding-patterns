package singelton.breaker;

import singelton.Singelton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingeltonBreaker {

    public void reflction() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> obj2=Class.forName("singelton.impl.SingleThreadSingleton");

        Constructor<?>[] c=obj2.getDeclaredConstructors();
        c[0].setAccessible(true);

        Singelton obj3= (Singelton) c[0].newInstance();
        System.out.println(obj3.hashCode());
    }
}
