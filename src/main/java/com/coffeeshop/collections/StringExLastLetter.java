package com.coffeeshop.collections;

import java.util.Arrays;

public class StringExLastLetter {

    public static void main(String[] args) {
        String[] arr = {"basketball", "Cybage","Bash", "CPL", "2026","cpl","bash"};


        Arrays.stream(arr).filter(s -> s.endsWith("l")|| s.endsWith("L"))
                .forEach(System.out::println);
    }
}
