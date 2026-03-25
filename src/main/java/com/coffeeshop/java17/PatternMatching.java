package com.coffeeshop.java17;

public class PatternMatching {
    public static void main(String[] args) {
        Object obj = "hello";

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}