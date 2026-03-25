package com.coffeeshop.stingProb;

import java.util.HashSet;

public class TestEqual {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();

        set.add(new Person("Karan", 25));
        set.add(new Person("Karan", 25));

        System.out.println(set.size());


        HashSet<Employee> set1 = new HashSet<>();

        set1.add(new Employee(1, "A"));
        set1.add(new Employee(1, "B")); // duplicate based on id

        System.out.println(set.size()); // 1

        Employee e1 = new Employee(1, "Karan");
        Employee e2 = new Employee(1, "Karan");

        System.out.println(e1.equals(e2)); // true

        System.out.println(e1.equals(e2));
    }
}