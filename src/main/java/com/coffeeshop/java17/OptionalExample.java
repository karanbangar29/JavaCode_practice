package com.coffeeshop.java17;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);

        name.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("No value present")
        );
    }
}