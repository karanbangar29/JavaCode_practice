package com.coffeeshop.java21;

public class VirtualThreadExample {
    public static void main(String[] args) throws Exception {

        Runnable task = () -> {
            System.out.println("Running in: " + Thread.currentThread());
        };

        Thread.startVirtualThread(task);

        Thread.sleep(1000); // wait
    }
}