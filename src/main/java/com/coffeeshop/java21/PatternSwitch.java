package com.coffeeshop.java21;

public class PatternSwitch {
    public static void main(String[] args) {

        Object obj = "Hello";

        String result = switch (obj) {
            case String s -> "String: " + s;
            case Integer i -> "Integer: " + i;
            default -> "Unknown";
        };

        System.out.println(result);
    }
}