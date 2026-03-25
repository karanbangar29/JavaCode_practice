package com.coffeeshop.oops;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s=Singleton.getInstance();
        System.out.println(s.toString());

        SingletonSynchronized singletonSynchronized=SingletonSynchronized.getInstance();
        System.out.println(singletonSynchronized);

    }
}
