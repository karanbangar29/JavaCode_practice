package com.coffeeshop.collections;

import java.util.Comparator;
import java.util.List;

public class EmployeeSortingSalary {
    public static void main(String[] args) {
        List<Employee>employees=List.of(
                new Employee(1,"karan", 70000.0,"dev"),
                new Employee(2,"ajay",  50000.0,"HR"),
                new Employee(3,"roshan",60000.0,"QA"),
                new Employee(4,"manish",8000.0,"QA"),
                new Employee(5,"maari",8000.0,"dev")
        );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(e -> System.out.println(e.getName()+" " +e.getSalary()));
    }
}
