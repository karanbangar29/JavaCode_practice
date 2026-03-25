package com.coffeeshop.multithreading;

import java.util.List;
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
     ExecutorService exce=Executors.newFixedThreadPool(3);
       List< Callable<Integer>>task= List.of(
                () -> 1,
                 ()-> 2,
                ()-> 3
        );

     List<Future<Integer>>futures=exce.invokeAll(task);
     for (Future<Integer> f : futures){
         System.out.println(f.get());
     }
    }

}
