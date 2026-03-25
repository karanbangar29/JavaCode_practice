package com.coffeeshop.java17;

public class RecordExample {
    record Employee(int id, String name, double salary) {}

    public static void main(String[] args) {
        Employee e = new Employee(1, "Karan", 50000);
        System.out.println(e.name());
        System.out.println(e);
    }
}