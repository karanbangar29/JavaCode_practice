package com.coffeeshop.collections;

import java.util.List;

public class StreamApiPractice {
    public static void main(String[] args) {
        List<String>names=List.of("karan","aman","kiran","nandini");
        System.out.println(names.stream()
                .filter(n -> n.startsWith("n"))
                .toList());
    }
}
