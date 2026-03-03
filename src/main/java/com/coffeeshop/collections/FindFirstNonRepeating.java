package com.coffeeshop.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeating {


        public static void main(String[] args) {

            String str="swiss";

            //w
            System.out.println(
//                findChar("swiss")
                    str.chars()
                            .mapToObj(c -> (char)c)
                            .collect(Collectors.groupingBy(
                                    Function.identity(),
                                    LinkedHashMap:: new,
                                    Collectors.counting()))
                            .entrySet().stream()
                            .filter(e ->e.getValue() == 1)
                            .map(Map.Entry :: getKey)
                            .findFirst()
                            .orElse(null));
        }
//    public static Character findChar(String str){
//      return  str.chars()
//                .mapToObj(c -> (char)c)
//                .collect(Collectors.groupingBy(
//                                Function.identity(),
//                        LinkedHashMap:: new,
//                                Collectors.counting()))
//                                .entrySet().stream()
//                                .filter(e ->e.getValue() == 1)
//                                .map(Map.Entry :: getKey)
//                                .findFirst()
//                                .orElse(null);
//    }
}
