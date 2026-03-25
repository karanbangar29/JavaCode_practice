package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class CFAllOf {
    public static void main(String[] args) {

        CompletableFuture<Void> f1 =
            CompletableFuture.runAsync(() -> System.out.println("Task1"));

        CompletableFuture<Void> f2 =
            CompletableFuture.runAsync(() -> System.out.println("Task2"));

        CompletableFuture.allOf(f1, f2).join();
    }
}