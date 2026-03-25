package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionEx {
    public static void main(String[] args) {
        List<String>list= List.of("abc","");
        System.out.println( list.stream().collect(Collectors.joining()));

    }
}
