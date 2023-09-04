package com.example.operations;

import com.example.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(34234, "E1", 1000.00));
        employees.add(new Employee(14234, "E2", 2000.00));
        employees.add(new Employee(34234, "E3", 5000.00));
        employees.add(new Employee(54234, "E4", 4000.00));
        employees.add(new Employee(44234, "E5", 3000.00));

        employees.sort(Comparator.comparing(Employee::getSalary));


        employees
                .stream()
                //.filter(e -> e.getSalary() > 3000)
//                .takeWhile(employee -> employee.getSalary() <= 3000) // break
                .dropWhile(employee -> employee.getSalary()<=3000)
                .forEach(System.out::println);


    }
}

//  Streams Apis
//  filter,takeWhile,dropWhile,disticnt,limit,skip