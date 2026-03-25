package com.coffeeshop.oops;

enum SingletonEnum {
    INSTANCE;

    public void showMessage() {
        System.out.println("Singleton using Enum");
    }
}