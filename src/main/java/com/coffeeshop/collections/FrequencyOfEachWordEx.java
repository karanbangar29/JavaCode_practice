package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachWordEx {

    public static void main(String[] args) {


        String para = "Cat is chasing mice mice is ahead of cat";

        Map<String,Long>output= Arrays.stream(para.split("\\s+"))
                .map(String :: toLowerCase)
                .collect(Collectors.groupingBy(
                       a -> a,
                        Collectors.counting()
                ));

        output.forEach((a, b) ->
        System.out.println(a +" : " +b));

    }

}
