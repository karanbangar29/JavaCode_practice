package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigit {
    public static void main(String[] args) {
        int i =125516;
      Integer sum= Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();

        System.out.println(sum);
    }
}
