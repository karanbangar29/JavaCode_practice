package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class CFCombine {
    public static void main(String[] args) {

        CompletableFuture<Integer> f1 =
            CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<Integer> f2 =
            CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Integer> result =
            f1.thenCombine(f2, (a, b) -> a + b);

        System.out.println(result.join());
    }
}