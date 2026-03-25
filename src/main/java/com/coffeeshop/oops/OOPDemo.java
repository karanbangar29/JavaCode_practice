package com.coffeeshop.oops;

// 1. Abstraction
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // abstract method
    abstract void start();

    // concrete method
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// 2. Inheritance + Polymorphism (Method Overriding)
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Car starts with key ignition");
    }
}

class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Bike starts with self or kick");
    }
}

// 3. Encapsulation
class Person {
    private String name;  // private variable

    public String getName() {   // getter
        return name;
    }

    public void setName(String name) {  // setter
        this.name = name;
    }
}

// Main Class
public class OOPDemo {
    public static void main(String[] args) {

        // Encapsulation
        Person p = new Person();
        p.setName("Karan");
        System.out.println("Person Name: " + p.getName());


        // Abstraction + Inheritance + Polymorphism
        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("Honda");

        v1.displayBrand();
        v1.start();  // runtime polymorphism


        v2.displayBrand();
        v2.start();  // runtime polymorphism
    }
}