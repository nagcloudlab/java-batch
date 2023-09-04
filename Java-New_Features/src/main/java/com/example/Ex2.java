package com.example;

import com.example.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 23, 100, "IT"));
        employees.add(new Employee("Mary", 24, 300, "HR"));
        employees.add(new Employee("Peter", 25, 400, "SALES"));
        employees.add(new Employee("Sara", 26, 200, "HR"));
        employees.add(new Employee("Jane", 22, 400, "TRAINING"));
//        employees.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return Integer.compare(o1.getSalary(), o2.getSalary());
//            }
//        });
        Comparator<Employee> bySalary = (o1, o2) -> Integer.compare(o1.getSalary(), o2.getSalary());
        Comparator<Employee> byAge = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());
        Comparator<Employee> bySalaryAndAge=bySalary.thenComparing(byAge);

        employees.sort(bySalaryAndAge);

        display(employees);


    }

    private static void display(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
