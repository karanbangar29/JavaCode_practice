package com.coffeeshop.multithreading;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {

    public static void main(String[] args) {
        Runnable runnable=() -> System.out.println("task running...");

        Thread t=new Thread(runnable);
        t.start();

        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(() -> System.out.println("thread is running in executor service.."));
    }
}
