package com.coffeeshop.java17;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,2,3,4,4);

        list.stream()
            .distinct()
            .forEach(System.out::println);
    }
}