package com.coffeeshop.java8;

import java.util.*;
import java.util.stream.*;

class Emp {
    String name, dept;

    Emp(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}

public class GroupByDept {
    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(
            new Emp("A", "IT"),
            new Emp("B", "HR"),
            new Emp("C", "IT")
        );

        Map<String, List<Emp>> map =
            list.stream()
                .collect(Collectors.groupingBy(e -> e.dept));

        System.out.println(map);
    }
}