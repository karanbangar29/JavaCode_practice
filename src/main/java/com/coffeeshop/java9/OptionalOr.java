package com.coffeeshop.java9;

import java.util.Optional;

public class OptionalOr {
    public static void main(String[] args) {
        Optional<String> opt = Optional.empty();

        String result = opt.or(() -> Optional.of("Default")).get();

        System.out.println(result);
    }
}