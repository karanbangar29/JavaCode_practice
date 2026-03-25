package com.coffeeshop.java8;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,8,1);

        list.stream()
            .sorted()
            .forEach(System.out::println);
    }
}