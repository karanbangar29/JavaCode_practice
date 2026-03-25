package com.coffeeshop.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicRequestCounter {
    public static void main(String[] args) {

    }
    private static final AtomicInteger count=new AtomicInteger();

    public void increament(){
        count.incrementAndGet();
    }
}
