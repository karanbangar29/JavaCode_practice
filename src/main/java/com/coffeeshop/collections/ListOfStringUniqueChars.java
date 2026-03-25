package com.coffeeshop.collections;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListOfStringUniqueChars {
    public static void main(String[] args) {
//        Input- book,pen,ccc output - bk,pen
        String s="book";

        System.out.println(s.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining()));
    }
}
