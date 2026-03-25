package com.coffeeshop.java9;

import java.util.stream.Stream;

public class NullSafe {
    public static void main(String[] args) {
        String str = null;

        Stream.ofNullable(str)
              .map(String::toUpperCase)
              .forEach(System.out::println);
    }
}