package com.coffeeshop.collections;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FindNonRepeatingChars {
    public static void main(String[] args) {
        String input="programming";

        System.out.println(input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap :: new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue()==1)
                .map(e -> String.valueOf(e.getKey()))
                .collect(Collectors.joining()));

    }
}
