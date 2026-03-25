package com.coffeeshop.java21;

public class RecordPattern {

    record Person(String name, int age) {}

    public static void main(String[] args) {
        Person p = new Person("Karan", 25);

        if (p instanceof Person(String name, int age)) {
            System.out.println(name + " " + age);
        }
    }
}