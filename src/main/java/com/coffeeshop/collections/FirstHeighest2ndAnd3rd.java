package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FirstHeighest2ndAnd3rd {
    public static void main(String[] args) {

        List<Integer> integers= Arrays.asList(1200,31,13,11,34,223,122,1223);

      Integer secondHighest = integers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(-1);


        System.out.println(secondHighest);

    }
}
