package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArraySorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6, 7};
        int[] arr2 = {2, 4, 5, 8, 9};

        int[] mergedSorted =
                IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
//                        .distinct()
                        .sorted()
                        .toArray();

        System.out.println(Arrays.toString(mergedSorted));
    }
}
