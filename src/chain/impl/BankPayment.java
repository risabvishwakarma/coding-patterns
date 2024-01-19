package chain.impl;

import chain.PaymentHandler;


public class BankPayment extends PaymentHandler {
    @Override
    public void doPayment(int pay) {
        if(pay<500){
            System.out.println("Payment has been done by "+this.getClass().getName()+" of $"+pay);
        }else{
            next.doPayment(pay);
        }
    }
}
