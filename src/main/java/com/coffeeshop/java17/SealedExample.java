package com.coffeeshop.java17;

public class SealedExample {

    sealed class Shape permits Circle, Rectangle {}

    final class Circle extends Shape {
        double radius;
    }

    final class Rectangle extends Shape {
        double length, width;
    }
}