package org.xpdojo.bank;

public class Account {

    public static Account emptyAcccount(){
        return new Account();
    }
    private Account(){
        balance=0;
    }

    public int balanc(){
        return balance;
    }

    public void deposit(int amount){
        blance +=amount;
    }
}
