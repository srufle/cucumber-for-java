package com.example.rufle.cucumber_fun.nicebank;

public class Account {

    private Money balance = new Money();

    public Account(Money amount) {
        super();
        this.balance = amount;
    }

    public Account() {
        super();
    }

    public void deposit(Money amount) {
        balance = balance.add(amount);
    }

    public Money withdraw(Money amount) {
        balance = balance.subtract(amount);
        return amount;
    }

    public Money getBalance() {
        return balance;
    }
}
