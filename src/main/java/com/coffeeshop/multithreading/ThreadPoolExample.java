package com.coffeeshop.multithreading;

import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {

        ThreadPoolExecutor executor =
            new ThreadPoolExecutor(
                2, 4,
                60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                new ThreadPoolExecutor.CallerRunsPolicy()
            );

        for (int i = 1; i <= 10; i++) {
            int task = i;
            executor.execute(() -> {
                System.out.println("Task " + task);
            });
        }

        executor.shutdown();
    }
}