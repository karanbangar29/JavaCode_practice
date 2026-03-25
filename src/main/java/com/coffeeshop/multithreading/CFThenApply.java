package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class CFThenApply {
    public static void main(String[] args) {

        CompletableFuture<Integer> future =
            CompletableFuture.supplyAsync(() -> 10)
                .thenApply(x -> x * 2);

        System.out.println(future.join());
    }
}