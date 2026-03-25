package com.coffeeshop.java17;

public class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        String op = "*";

        int result = switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Invalid operator");
        };

        System.out.println(result);
    }
}