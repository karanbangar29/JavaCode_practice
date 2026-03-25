package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class CFAnyOf {
    public static void main(String[] args) {

        CompletableFuture<String> f1 =
            CompletableFuture.supplyAsync(() -> "Fast");

        CompletableFuture<String> f2 =
            CompletableFuture.supplyAsync(() -> "Slow");

        Object result = CompletableFuture.anyOf(f1, f2).join();

        System.out.println(result);
    }
}