package com.coffeeshop.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestWordFinder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "watermelon", "pear");
//        System.out.println(findLongestWords(words)); // [watermelon]
      String strings= words.stream()
              .max(Comparator.comparingInt(String::length))
              .orElseThrow(null);
        System.out.println(strings);
    }

//    private static List<String> findLongestWords(List<String> words) {
//
//    }
    }