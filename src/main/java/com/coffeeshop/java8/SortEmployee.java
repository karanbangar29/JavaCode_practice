package com.coffeeshop.java8;

import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("A", 50000),
            new Employee("B", 30000)
        );

        list.stream()
            .sorted(Comparator.comparing(e -> e.salary))
            .forEach(e -> System.out.println(e.name));
    }
}