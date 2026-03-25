package com.coffeeshop.java9;

import java.util.*;

public class ImmutableList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        System.out.println(list);

        // list.add(5); throws UnsupportedOperationException
    }
}