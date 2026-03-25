package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class CFReturn {
    public static void main(String[] args) {

        CompletableFuture<Integer> future =
            CompletableFuture.supplyAsync(() -> 10 + 20);

        System.out.println(future.join());
    }
}