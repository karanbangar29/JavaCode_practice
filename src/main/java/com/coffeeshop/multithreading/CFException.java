package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class CFException {
    public static void main(String[] args) {

        CompletableFuture<Integer> future =
            CompletableFuture.supplyAsync(() -> {
                if (true) throw new RuntimeException("Error");
                return 10;
            }).exceptionally(ex -> {
                System.out.println("Handled: " + ex.getMessage());
                return 0;
            });

        System.out.println(future.join());
    }
}