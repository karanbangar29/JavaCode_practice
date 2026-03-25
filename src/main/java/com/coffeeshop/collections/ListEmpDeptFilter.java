package com.coffeeshop.collections;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListEmpDeptFilter {
    public static void main(String[] args) {
        //list emp
        // sort by slary grp by department
        List<Employee>employees=List.of(
                new Employee(1,"karan", 70000.0,"dev"),
                new Employee(2,"ajay",  50000.0,"HR"),
                new Employee(3,"roshan",60000.0,"QA"),
                new Employee(4,"manish",8000.0,"QA"),
                new Employee(5,"maari",8000.0,"dev")
        );

        Map<String,List<Employee>>output= employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(
                                                Employee::getSalary
                                        ))
                                        .toList()
                        )
                ));
        output.forEach((dept,empList) ->{
            System.out.println("department: "+dept);
            empList.forEach(System.out::println);
        });
    }
}
