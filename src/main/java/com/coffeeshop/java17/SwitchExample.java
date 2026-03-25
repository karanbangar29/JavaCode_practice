package com.coffeeshop.java17;

public class SwitchExample {
    public static void main(String[] args) {
        int marks = 85;

        String grade = switch (marks / 10) {
            case 9, 10 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> "Fail";
        };

        System.out.println(grade);
    }
}