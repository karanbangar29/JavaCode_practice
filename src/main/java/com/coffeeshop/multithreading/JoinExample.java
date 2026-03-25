package com.coffeeshop.multithreading;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 running");
        });

        t1.start();
        t1.join(); // wait for t1

        System.out.println("Main thread continues");
    }
}