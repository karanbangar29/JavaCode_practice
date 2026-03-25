package com.coffeeshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListEx {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("mango");

        list.stream()
                .sorted(Comparator.comparingInt(String :: length))
                .forEach(System.out::println);

    }
}
