package com.coffeeshop.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyBigramInParagraph {
    public static void main(String[] args) {
        String paragraph="Java is fast and Java is powerful and Java is everywhere";
        String[] words=paragraph
                .toLowerCase()
                .replaceAll("[^a-zA-Z0-9 ]","")
                .split("\\s+");

      Map<String,Long>bigramFreq= IntStream.range(0,words.length -1)
                .mapToObj(i -> words[i] +" "+words[i + 1])
                .collect(Collectors.groupingBy(bigram -> bigram,
                         LinkedHashMap::new,Collectors.counting()));

   bigramFreq.forEach((bigram,count)->
           System.out.println(bigram+" "+count));
    }
}
