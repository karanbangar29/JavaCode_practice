package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class ApiExample {
    public static void main(String[] args) {

        CompletableFuture<String> api1 =
            CompletableFuture.supplyAsync(() -> "User Data");

        CompletableFuture<String> api2 =
            CompletableFuture.supplyAsync(() -> "Order Data");

        CompletableFuture<String> result =
            api1.thenCombine(api2, (u, o) -> u + " + " + o);

        System.out.println(result.join());
    }
}