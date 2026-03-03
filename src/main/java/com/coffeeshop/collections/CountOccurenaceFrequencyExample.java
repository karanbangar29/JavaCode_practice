package com.coffeeshop.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurenaceFrequencyExample {
    public static void main(String[] args) {
        String str ="hello world";

        Map< Character,Long>outPut= str.chars()
                .filter(Character :: isLetter)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
//                        LinkedHashMap :: new,
                        Collectors.counting()
                ))
                        .entrySet()
                                .stream()
                                        .sorted(Map.Entry.comparingByKey())
                                                .collect(Collectors.toMap(
                                                        Map.Entry::getKey,
                                                        Map.Entry::getValue,
                                                        (a,b) -> a,
                                                        LinkedHashMap :: new
                                                ));
        System.out.println(outPut);
    }
}
