package com.coffeeshop.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx2Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newSingleThreadExecutor();
        Future<String>future=service.submit(new CallableEx2());
        String result=future.get();
        System.out.println(result);

    }
}
