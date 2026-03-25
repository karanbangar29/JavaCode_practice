package com.coffeeshop.multithreading;

class MyRunnable implements Runnable {
    public void run() {

        System.out.println("Running: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}