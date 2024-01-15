package proxy.account.impl;

import proxy.account.Account;

public class BankAccount implements Account {

    @Override
    public void withdraw() {
        System.out.println("Amount withdraw");

    }

    @Override
    public void deposit() {
        System.out.println("Amount deposited");
    }

    @Override
    public void getAccountNo() {

    }
}
