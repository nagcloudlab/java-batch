package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.exception.EmployeeNotFoundException;
import com.example.exception.TrainingExistException;
import com.example.model.Employee;
import com.example.model.Training;

public class TrainingServiceImpl implements TrainingService {

	private Map<Integer, Training> trainings = new HashMap<>();
	private Map<Integer, List<Integer>> enrolledTrainings = new HashMap<>();

	private EmployeeService employeeService;

	public TrainingServiceImpl(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@Override
	public void createNewTraining(Training training) {

		if (trainings.containsKey(training.getId()))
			throw new TrainingExistException(training.getId());
		trainings.put(training.getId(), training);

	}

	@Override
	public boolean registerTraining(int empId, int trainingId) {

		Employee employee = employeeService.getEmployee(empId);
		if (employee == null)
			throw new EmployeeNotFoundException(empId);

		if (!trainings.containsKey(trainingId)) {
			throw new EmployeeNotFoundException(empId);
		}

		List<Integer> list = enrolledTrainings.get(empId);
		if(list==null)
			list=new ArrayList<>();
		for (Integer t : list) {
			if (t == trainingId) {
				throw new TrainingExistException(trainingId);
			}
		}
		list.add(trainingId);
		enrolledTrainings.put(empId, list);

		return true;
	}

}
