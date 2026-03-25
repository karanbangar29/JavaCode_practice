package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> 10 + 20;

        Future<Integer> result = executor.submit(task);

        System.out.println(result.get());

        executor.shutdown();
    }
}