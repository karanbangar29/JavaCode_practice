package com.coffeeshop.java9;

interface MyInterface {

    default void show() {
        helper();
        System.out.println("Show method");
    }

    private void helper() {
        System.out.println("Private helper");
    }
}