package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainEx {
    public static void main(String[] args) {
        String input="karan is name my";
        //my name is karan.
        String[] arr=input.split(" ");

//        IntStream.range(0, arr.length)
//                .mapToObj(i-> arr[arr.length -1 -i])
//                .collect(Collectors.joining(" "));

        System.out.println( IntStream.range(0, arr.length)
                .mapToObj(i-> arr[arr.length -1 -i])
                .collect(Collectors.joining(" ")));
    }

}
