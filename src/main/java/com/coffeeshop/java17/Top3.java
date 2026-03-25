package com.coffeeshop.java17;

import java.util.*;

public class Top3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 50, 30, 70, 20);

        list.stream()
            .sorted(Comparator.reverseOrder())
            .limit(3)
            .forEach(System.out::println);
    }
}