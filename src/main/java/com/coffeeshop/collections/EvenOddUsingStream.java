package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddUsingStream {
    public static void main(String[] args) {
        List<Integer>nums= List.of(1,2,3,4,5,6,7,8);
        System.out.println(
                nums.stream().collect(Collectors.partitioningBy(s -> s % 2==0))
                        .entrySet().stream()
                        .collect(Collectors.toMap(
                                entry -> entry.getKey() ? "even": "odd",
                                Map.Entry::getValue
                        ))
        );
    }
}
