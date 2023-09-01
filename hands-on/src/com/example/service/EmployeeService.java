package com.example.service;

import com.example.model.Employee;

public interface EmployeeService {
	
	void createNewEmployee(Employee employee);
	Employee getEmployee(int id);

}
