package com.coffeeshop.stingProb;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,4,5,7};
        int[] arr2={2,3,6,5,8,9};

        int[] mergedArray= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
                .distinct()
                .sorted().toArray();
        System.out.println(Arrays.toString(mergedArray));
    }

    String str="ab";

//    String/()
}
