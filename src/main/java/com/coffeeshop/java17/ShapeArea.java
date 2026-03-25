package com.coffeeshop.java17;

public class ShapeArea {

    sealed interface Shape permits Circle, Rectangle {}

    record Circle(double radius) implements Shape {}
    record Rectangle(double l, double w) implements Shape {}

    static double area(Shape s) {
        return switch (s) {
            case Circle c -> Math.PI * c.radius() * c.radius();
            case Rectangle r -> r.l() * r.w();
        };
    }

    public static void main(String[] args) {
        System.out.println(area(new Circle(5)));
    }
}