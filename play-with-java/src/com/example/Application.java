package com.example;

import com.example.emp.Employee;
import com.example.p1.A;
import com.example.p1.B;
import com.example.p1.C;
import com.example.p2.D;
import com.example.p2.E;

/**
 * Dev-2
 */
public class Application {
	public static void main(String[] args) {
		
		Employee.tnrName="Nag";

		Employee employee = new Employee(101);
		employee.setName("E");
		employee.setSalary(100.00);

		// ...

		employee.setSalary(200.00);

		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}
}
