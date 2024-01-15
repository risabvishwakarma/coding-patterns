package singelton;

public enum BestSingleton implements Singelton {
    INSTANCE;

    @Override
    public void printHello() {
        System.out.println(this.hashCode());
    }
}
