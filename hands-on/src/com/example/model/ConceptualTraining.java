package com.example.model;

import java.time.LocalDate;
import java.util.Set;

public class ConceptualTraining extends Training {

	public ConceptualTraining(int id, String name, Set<String> skills, LocalDate startDate, LocalDate endDate) {
		super(id, name, skills, startDate, endDate);
	}

}
