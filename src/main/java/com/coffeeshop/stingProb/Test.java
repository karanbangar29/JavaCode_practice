package com.coffeeshop.stingProb;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();

        set.add(new Person("Karan", 25));
        set.add(new Person("Karan", 25));

        System.out.println(set.size());
    }
}