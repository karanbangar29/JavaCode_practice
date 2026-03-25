package com.coffeeshop.stingProb;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("abc");
        StringBuilder sb2=sb1;

        sb1.append("d");


        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
//        System.out.println(sb1.toString().equals(sb2.toString()));


    }
}
