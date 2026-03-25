package com.coffeeshop.oops;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 5000; // bonus
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 10000;
    }
}

public class CompanyApp {
    public static void main(String[] args) {
        Employee e1 = new Developer("Karan", 40000);
        Employee e2 = new Manager("Rahul", 60000);

        System.out.println(e1.getName() + " Salary: " + e1.calculateSalary());
        System.out.println(e2.getName() + " Salary: " + e2.calculateSalary());
    }
}