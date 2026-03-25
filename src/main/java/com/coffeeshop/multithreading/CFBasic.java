package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class CFBasic {
    public static void main(String[] args) {

        CompletableFuture<Void> future =
            CompletableFuture.runAsync(() -> {
                System.out.println("Running async task");
            });

        future.join(); // wait
    }
}