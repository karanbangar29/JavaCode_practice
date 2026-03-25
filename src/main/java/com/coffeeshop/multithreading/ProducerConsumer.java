package com.coffeeshop.multithreading;

class Shared {
    private int data;
    private boolean hasData = false;

    synchronized void produce(int value) throws InterruptedException {
        while (hasData) wait();

        data = value;
        System.out.println("Produced: " + value);
        hasData = true;

        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!hasData) wait();

        System.out.println("Consumed: " + data);
        hasData = false;

        notify();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {

        Shared s = new Shared();

        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) s.produce(i);
            } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) s.consume();
            } catch (Exception e) {}
        }).start();
    }
}