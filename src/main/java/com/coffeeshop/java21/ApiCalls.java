package com.coffeeshop.java21;

import java.util.concurrent.*;

public class ApiCalls {
    public static void main(String[] args) throws Exception {

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

            Future<String> f1 = executor.submit(() -> "API1");
            Future<String> f2 = executor.submit(() -> "API2");

            System.out.println(f1.get());
            System.out.println(f2.get());
        }
    }
}