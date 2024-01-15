package proxy;

import proxy.account.Account;
import proxy.account.impl.BankAccount;

public class ATM implements Account {
    BankAccount ba;
    public void accessAccount(){
        ba=new BankAccount();
    }
    @Override
    public void withdraw() {
        ba.withdraw();
    }

    @Override
    public void deposit() {
        ba.deposit();

    }

    @Override
    public void getAccountNo() {

    }
}
