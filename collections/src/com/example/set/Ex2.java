package com.example.set;

import com.example.model.Employee;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class BySalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());
    }
}
public class Ex2 {

    public static void main(String[] args) {

        Set<Employee> employees=new TreeSet<>(/*new BySalaryComparator()*/);
        employees.add(new Employee(1,"E1",100.00));
        employees.add(new Employee(2,"E3",200.00));
        employees.add(new Employee(3,"E2",400.00));
        employees.add(new Employee(4,"E2",300.00));
        employees.add(new Employee(5,"E5",300.00));

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
