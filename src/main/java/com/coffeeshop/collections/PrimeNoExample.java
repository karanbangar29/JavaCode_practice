package com.coffeeshop.collections;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNoExample {
    public static void main(String[] args) {
        List<Integer> result=
                IntStream.rangeClosed(1,10)
                        .filter(n -> n >1)
                        .filter(n -> IntStream.rangeClosed(
                                2,(int)Math.sqrt(n))
                                .noneMatch(i -> n % i ==0))
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .peek(System.out::println)
                        .collect(Collectors.toList());

    }
}
