package com.coffeeshop.java8;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,1);

        Set<Integer> set = new HashSet<>();

        list.stream()
            .filter(n -> !set.add(n))
            .forEach(System.out::println);
    }
}