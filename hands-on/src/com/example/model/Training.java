package com.example.model;

import java.time.LocalDate;
import java.util.Set;

public abstract class Training {
	
	private int id;
	private String name;
	private Set<String> skills;
	private LocalDate startDate;
	private LocalDate endDate;
	public Training(int id, String name, Set<String> skills, LocalDate startDate, LocalDate endDate) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	
	

}
