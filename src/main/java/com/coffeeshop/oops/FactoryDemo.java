package com.coffeeshop.oops;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) return new Circle();
        if (type.equalsIgnoreCase("rectangle")) return new Rectangle();
        return null;
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        Shape s = ShapeFactory.getShape("circle");
        s.draw();
    }
}