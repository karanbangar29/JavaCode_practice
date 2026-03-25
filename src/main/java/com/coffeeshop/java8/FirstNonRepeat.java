package com.coffeeshop.java8;

import java.util.*;
import java.util.stream.*;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String str = "aabbcde";

        Character result = str.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() == 1)
            .findFirst()
            .get()
            .getKey();

        System.out.println(result);
    }
}