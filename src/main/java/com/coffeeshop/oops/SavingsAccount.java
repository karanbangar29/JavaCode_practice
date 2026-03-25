package com.coffeeshop.oops;

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 1000) {
            System.out.println("Minimum balance required!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}