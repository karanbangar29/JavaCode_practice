package com.coffeeshop.java8;

import java.util.*;
import java.util.stream.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "aabbcc";

        Map<Character, Long> map =
            str.chars()
               .mapToObj(c -> (char)c)
               .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map);
    }
}