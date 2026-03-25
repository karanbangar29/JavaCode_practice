package com.coffeeshop.collections;

public class ShortedPalindrom {

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("ab"));
        System.out.println(shortestPalindrome("abcd"));
        System.out.println(shortestPalindrome("adam"));
    }

    public static  String shortestPalindrome(String str){
        String rev= new StringBuilder(str).reverse().toString();

        for (int i=0; i<str.length(); i++){
            if(str.startsWith(rev.substring(i))){
                return rev.substring(0,i)+str;
            }
        }
        return str;
    }

}
