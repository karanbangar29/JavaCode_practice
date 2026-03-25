package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class CFAcceptBoth {
    public static void main(String[] args) {

        CompletableFuture<Integer> f1 =
            CompletableFuture.supplyAsync(() -> 5);

        CompletableFuture<Integer> f2 =
            CompletableFuture.supplyAsync(() -> 10);

        f1.thenAcceptBoth(f2, (a, b) -> {
            System.out.println("Sum: " + (a + b));
        }).join();
    }
}