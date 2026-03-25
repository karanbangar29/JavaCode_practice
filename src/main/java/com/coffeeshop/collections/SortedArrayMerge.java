package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedArrayMerge {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 7, 8, 9};

        int[] mergeArray=IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(mergeArray));

    }
}
