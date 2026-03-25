package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueCharEx {
    //idenfy unq from A,B,C,B,A         X,Y,X,U,X      D,E,F,D,E
    //

    public static void main(String[] args) {
        List<String> input= Arrays.asList("ABCBA","XYXUX"," DEFDE");

       List<String>out= input.stream()
               .map(str -> str.chars()
                       .mapToObj(c -> (char) c)
               .collect(Collectors.groupingBy(
                       ch -> ch,
                       LinkedHashMap:: new,
                       Collectors.counting()
               ))
               .entrySet().stream()
               .filter(n -> n.getValue() == 1)
               .map(e -> String.valueOf(e.getKey()))
               .collect(Collectors.joining())
                  ).collect(Collectors.toList());
       out.forEach(System.out::println);

    }
}
