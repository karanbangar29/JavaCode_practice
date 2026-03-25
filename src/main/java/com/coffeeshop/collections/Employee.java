package com.coffeeshop.collections;


public class Employee {
    private long empId;
    private String name;
    private double salary;
    private String dept;
    public Employee(long empId, String name, double salary,String dept) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.dept=dept;
    }



    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ",dept="+dept+
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
