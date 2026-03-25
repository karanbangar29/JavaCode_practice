package com.coffeeshop.java21;

import java.util.*;

public class SequencedExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));

        list.addFirst(0);   // Java 21
        list.addLast(4);    // Java 21

        System.out.println(list);
    }
}