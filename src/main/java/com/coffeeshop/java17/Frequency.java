package com.coffeeshop.java17;

import java.util.*;
import java.util.stream.*;

public class Frequency {
    public static void main(String[] args) {
        String str = "aabbcc";

        Map<Character, Long> map =
            str.chars()
               .mapToObj(c -> (char)c)
               .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map);
    }
}