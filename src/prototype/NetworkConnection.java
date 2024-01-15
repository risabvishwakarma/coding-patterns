package prototype;

public class NetworkConnection implements Cloneable{
    private String ip=null;

    public NetworkConnection(String ip) throws InterruptedException {
        this.ip=ip;
        loadVeryImpData();

    }

    public void loadVeryImpData() throws InterruptedException {
        System.out.println("loading important data...");
        Thread.sleep(5000);
        System.out.println("loading complete.");
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +"hashCode='" + this.hashCode()+
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return  super.clone();
    }
}
