package com.example.set;

import com.example.model.Employee;

import java.util.HashSet;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "E1", 100.00);
        Employee e2 = new Employee(1, "E1", 100.00);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);

        System.out.println(employees.size());

    }
}
