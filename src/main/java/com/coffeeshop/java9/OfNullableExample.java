package com.coffeeshop.java9;

import java.util.stream.Stream;

public class OfNullableExample {
    public static void main(String[] args) {
        String str = null;

        Stream.ofNullable(str)
              .forEach(System.out::println); // no exception
    }
}