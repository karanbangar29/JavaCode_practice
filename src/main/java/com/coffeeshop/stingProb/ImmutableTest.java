package com.coffeeshop.stingProb;

public class ImmutableTest {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" world");

        System.out.println(str); // hello
    }
}