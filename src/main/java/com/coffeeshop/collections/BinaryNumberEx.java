package com.coffeeshop.collections;

import java.util.Arrays;

public class BinaryNumberEx {
    public static void main(String[] args) {
        int[] num={1,1,0,1,1,1};
       int sum= Arrays.stream(num).sum();
        System.out.println(sum);
    }
}
