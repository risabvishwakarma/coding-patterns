package chain.impl;

import chain.PaymentHandler;


public class CreditPayment extends PaymentHandler {
    @Override
    public void doPayment(int pay) {
        if(pay<1000){
            System.out.println("Payment has been done by "+this.getClass().getName()+" of $"+pay);
        }else{
            next.doPayment(pay);
        }
    }
}
