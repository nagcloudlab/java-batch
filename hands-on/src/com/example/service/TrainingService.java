package com.example.service;

import com.example.model.Training;

public interface TrainingService {
	
	void createNewTraining(Training training);
	boolean registerTraining(int empId,int trainingId);

}
