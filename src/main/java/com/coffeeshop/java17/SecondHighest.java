package com.coffeeshop.java17;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40);

        int result = list.stream()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .get();

        System.out.println(result);
    }
}