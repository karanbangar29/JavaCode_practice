package com.coffeeshop.collections;

import java.util.*;
import java.util.stream.Collectors;

class ListEx {
    public static void main(String[] args) {
        List<String> s=List.of("a","b","a","c","d","b","e");

        List<String>output=new ArrayList<>();
        Map<String,Long> map=s.stream()
                .collect(Collectors.groupingBy(n -> n,
                        LinkedHashMap:: new, Collectors.counting()));

        map.forEach((k,v) -> {
            if(v==1)output.add(k);
        });

        map.forEach((k,v)-> {
            if(v>1) output.add(k);
        });

        System.out.println(output);
        //cdab
    }
}

//find






