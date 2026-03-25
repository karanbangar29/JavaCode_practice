package com.coffeeshop.java9;

import java.util.*;

public class RealProblem {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,6,7,8);

        list.stream()
            .takeWhile(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}