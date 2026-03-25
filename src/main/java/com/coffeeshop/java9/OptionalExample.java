package com.coffeeshop.java9;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);

        name.ifPresentOrElse(
            n -> System.out.println(n),
            () -> System.out.println("No value present")
        );
    }
}