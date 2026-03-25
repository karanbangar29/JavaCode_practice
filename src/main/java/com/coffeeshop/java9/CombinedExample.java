package com.coffeeshop.java9;

import java.util.*;

public class CombinedExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        list.stream()
            .filter(n -> n > 2)
            .takeWhile(n -> n < 5)
            .forEach(System.out::println);
    }
}