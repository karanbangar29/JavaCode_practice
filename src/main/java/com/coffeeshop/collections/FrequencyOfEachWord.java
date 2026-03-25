package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord {
    public static void main(String[] args) {
//        String scentence="Java Is Greate and Java is Advance";
        String scentence = "apple banana apple orange banana apple";

        Map<String,Long> freq= Arrays.
                stream(scentence.toLowerCase().split("\\s"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(freq);

    }
}
