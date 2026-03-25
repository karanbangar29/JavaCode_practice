package com.coffeeshop.oops;

public class BankApp {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("S123", 5000);
        BankAccount acc2 = new CurrentAccount("C456", 3000);

        acc1.deposit(2000);
        acc1.withdraw(5500);  // check rule
        acc1.showBalance();

        System.out.println("-----");

        acc2.withdraw(3500);
        acc2.showBalance();
    }
}