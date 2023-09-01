package com.example.service;

import java.util.HashMap;
import java.util.Map;

import com.example.exception.EmployeeExistException;
import com.example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private Map<Integer, Employee> employees = new HashMap<>();

	@Override
	public void createNewEmployee(Employee employee) {
		Employee existingEmployee = employees.get(employee.getId());
		if (existingEmployee != null)
			throw new EmployeeExistException(employee.getId());
		employees.put(employee.getId(), employee);
	}
	
	@Override
	public Employee getEmployee(int id) {
		return employees.get(id);
	}

}
