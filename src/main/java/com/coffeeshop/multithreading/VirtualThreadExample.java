package com.coffeeshop.multithreading;

public class VirtualThreadExample {
    public static void main(String[] args) throws Exception {

        Thread.startVirtualThread(() -> {
            System.out.println("Virtual Thread: " + Thread.currentThread());
        });

        Thread.sleep(1000);
    }
}