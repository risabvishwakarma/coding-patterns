package chain;

public abstract class PaymentHandler {
    protected PaymentHandler next;
    public PaymentHandler setNext(PaymentHandler paymentHandler){
        this.next=paymentHandler;
       return this.next;
    }
    public abstract void doPayment(int pay);

}
