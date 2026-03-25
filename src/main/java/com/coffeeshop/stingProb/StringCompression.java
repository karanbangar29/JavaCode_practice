package com.coffeeshop.stingProb;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbc";
        String result = "";
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result += str.charAt(i - 1) + "" + count;
                count = 1;
            }
        }

        System.out.println(result);
    }
}