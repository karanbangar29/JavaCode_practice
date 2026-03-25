    package com.coffeeshop.stingProb;

public class CountVowels {
    public static void main(String[] args) {
        String str = "hello world";
        int vowels = 0, consonants = 0;

        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}