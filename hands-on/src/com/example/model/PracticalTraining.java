package com.example.model;

import java.time.LocalDate;
import java.util.Set;

public class PracticalTraining extends Training {

	private int labDuration;

	public PracticalTraining(int id, String name, Set<String> skills, LocalDate startDate, LocalDate endDate,
			int labDuration) {
		super(id, name, skills, startDate, endDate);
		this.labDuration = labDuration;
	}

}
