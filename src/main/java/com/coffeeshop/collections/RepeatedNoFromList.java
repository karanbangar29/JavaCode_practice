package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedNoFromList {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(10,12,10,12,13,14,12,15,11,12);
        System.out.println(mostFrequent(numbers));

//       Integer repeatedNum= numbers.stream()
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey)
//                .orElseThrow(null);
//        System.out.println(repeatedNum);



    }

    private static Integer mostFrequent(List<Integer> list) {

        Map<Integer,Integer>freq=new HashMap<>();
        int maxCount=0;
        int mostFrequent=list.get(0);
        for(Integer n:list){
            int count= freq.merge(n,1,Integer::sum);
            if(count > maxCount){
                maxCount=count;
                mostFrequent=n;

            }
        }
        return mostFrequent;
    }
}
