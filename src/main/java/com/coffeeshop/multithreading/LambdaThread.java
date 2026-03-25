package com.coffeeshop.multithreading;

public class LambdaThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Lambda Thread: " + Thread.currentThread().getName());
        });
        t.start();
    }
}