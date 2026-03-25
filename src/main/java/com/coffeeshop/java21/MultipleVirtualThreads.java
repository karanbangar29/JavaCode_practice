package com.coffeeshop.java21;

public class MultipleVirtualThreads {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 5; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Task: " + Thread.currentThread());
            });
        }

        Thread.sleep(1000);
    }
}