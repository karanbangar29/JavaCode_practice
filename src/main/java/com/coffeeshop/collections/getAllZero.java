package com.coffeeshop.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getAllZero {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 0, 5, 0, 2, 0);

       List <Integer>getZero=numbers.stream()
               .filter(n -> n==0)
               .toList();
//   List<Integer>result=new ArrayList<>();
//       for (Integer num:numbers){
//           if (num ==0){
//               result.add(num);
//           }
//
//
//       }
        System.out.println(getZero);
//        System.out.println(getZero);
    }
}
