package com.coffeeshop.java9;

import java.util.stream.Stream;

public class IterateExample {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n < 10, n -> n + 2)
              .forEach(System.out::println);
    }
}