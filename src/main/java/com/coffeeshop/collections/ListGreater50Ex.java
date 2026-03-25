package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListGreater50Ex {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10, 45, 60, 75, 30, 90);

      List<Integer>list1=  list.stream().filter(n -> n>50)
                .toList();

        List<Integer>list2= list.stream().filter(n-> n<50)
                .toList();

        System.out.println("greater than 50: "+list1);
        System.out.println("less than 50: "+list2);


    }
}
