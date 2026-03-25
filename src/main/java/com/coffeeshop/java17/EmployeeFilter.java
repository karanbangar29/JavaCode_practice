package com.coffeeshop.java17;

import java.util.*;

public class EmployeeFilter {

    record Employee(String name, double salary) {}

    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee("A", 40000),
            new Employee("B", 60000)
        );

        list.stream()
            .filter(e -> e.salary() > 50000)
            .forEach(System.out::println);
    }
}