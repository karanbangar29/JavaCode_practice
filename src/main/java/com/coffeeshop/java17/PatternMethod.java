package com.coffeeshop.java17;

public class PatternMethod {

    static void print(Object obj) {
        if (obj instanceof Integer i) {
            System.out.println("Integer: " + i);
        } else if (obj instanceof String s) {
            System.out.println("String: " + s);
        }
    }

    public static void main(String[] args) {
        print(10);
        print("Hello");
    }
}