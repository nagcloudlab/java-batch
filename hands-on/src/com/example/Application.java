package com.example;

import java.util.ArrayList;

import com.example.model.Employee;
import com.example.model.PracticalTraining;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;
import com.example.service.TrainingService;
import com.example.service.TrainingServiceImpl;

public class Application {
	
	public static void main(String[] args) {
		
		EmployeeService employeeService=new EmployeeServiceImpl();
		TrainingService trainingService=new TrainingServiceImpl(employeeService);
		
		employeeService.createNewEmployee(new Employee(1, "E1"));
		trainingService.createNewTraining(new PracticalTraining(1, null, null, null, null, 0));
		trainingService.registerTraining(1, 1);
		
		
		final ArrayList<String> arrayList=new ArrayList<>();
		//arrayList=new ArrayList<>();
		arrayList.add("item-1");
	}

}
