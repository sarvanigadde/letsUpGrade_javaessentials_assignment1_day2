package com.employee;

public class Employee {
    int age;
    String name;
    String city;

    public void display() {
        System.out.println("The name is" + " " + name);
        System.out.println(age);
        System.out.println(city);
    }
}
public class Main {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.age=18;
        e.name="sravani";
        e.city="rajahmundry";
        e.display();
        Employee e1 = new Employee();
        e1.age=19;
        e1.name="bhuvana";
        e1.city="vijayawada";
        e1.display();
    }
}
