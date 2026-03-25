package com.coffeeshop.oops;

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}