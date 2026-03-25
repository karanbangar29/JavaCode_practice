package com.coffeeshop.collections;

import java.util.stream.IntStream;

public class LargestPalindrom {
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("ab"));
        System.out.println(shortestPalindrome("abcd"));
        System.out.println(shortestPalindrome("adam"));
    }
    public static String shortestPalindrome(String str){
        String rev=new StringBuilder(str).reverse().toString();
        return IntStream.range(0,str.length())
                .filter(n -> str.startsWith(rev.substring(n)))
                .mapToObj(i -> rev.substring(0,i)+str)
                .findFirst()
                .orElse(str);
    }
}
