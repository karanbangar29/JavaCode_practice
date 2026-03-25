package com.coffeeshop.java9;

import java.util.*;

public class TakeWhileExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,1,2);

        list.stream()
            .takeWhile(n -> n < 4)
            .forEach(System.out::println);
    }
}