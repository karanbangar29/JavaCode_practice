package com.coffeeshop.java8;

import java.util.*;

public class CountA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Rahul", "Ankit");

        long count = names.stream()
                          .filter(n -> n.startsWith("A"))
                          .count();

        System.out.println(count);
    }
}