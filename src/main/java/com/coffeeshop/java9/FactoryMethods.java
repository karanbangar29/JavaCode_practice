package com.coffeeshop.java9;

import java.util.*;

public class FactoryMethods {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(1,2,3);
        Map<Integer, String> map = Map.of(1, "A", 2, "B");

        System.out.println(set);
        System.out.println(map);
    }
}