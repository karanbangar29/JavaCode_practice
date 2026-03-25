package com.coffeeshop.java8;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4);

        list.stream()
            .distinct()
            .forEach(System.out::println);
    }
}