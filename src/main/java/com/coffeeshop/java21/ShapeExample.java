package com.coffeeshop.java21;

public class ShapeExample {

    sealed interface Shape permits Circle, Rectangle {}

    record Circle(double r) implements Shape {}
    record Rectangle(double l, double w) implements Shape {}

    static double area(Shape s) {
        return switch (s) {
            case Circle c -> Math.PI * c.r() * c.r();
            case Rectangle r -> r.l() * r.w();
        };
    }

    public static void main(String[] args) {
        System.out.println(area(new Circle(5)));
    }
}