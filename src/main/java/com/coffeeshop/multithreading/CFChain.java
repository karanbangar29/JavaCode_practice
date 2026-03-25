package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class CFChain {
    public static void main(String[] args) {

        CompletableFuture<String> future =
            CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(s -> s + " World")
                .thenApply(String::toUpperCase);

        System.out.println(future.join());
    }
}