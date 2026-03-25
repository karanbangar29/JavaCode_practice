package com.coffeeshop.multithreading;

import java.util.concurrent.Callable;

public class CallableEx2 implements Callable<String> {
    public String call() throws Exception{
        return "task completed";
    }

}
