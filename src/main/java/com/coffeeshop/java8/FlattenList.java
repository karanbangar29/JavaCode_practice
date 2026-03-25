package com.coffeeshop.java8;

import java.util.*;

public class FlattenList {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
            Arrays.asList(1,2),
            Arrays.asList(3,4)
        );

        list.stream()
            .flatMap(Collection::stream)
            .forEach(System.out::println);
    }
}