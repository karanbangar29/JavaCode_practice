package com.coffeeshop.stingProb;

import java.util.LinkedHashMap;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String str = "aabbcde";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}