package com.coffeeshop.multithreading;

public class RemoveNum {
    public static void main(String[] args) {
//        a1b2c3@#

        String str = "a1b2c3@#";
        StringBuffer sb = new StringBuffer();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        String sbb = sb.toString();
        System.out.println(sbb);
    }
}
