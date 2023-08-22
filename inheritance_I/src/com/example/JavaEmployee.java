package com.example;

public class JavaEmployee extends Employee {
	
	private String[] javaSkills;

	public JavaEmployee(int id, String name, double salary,String[] javaSkills) {
		super(id, name, salary);
		 this.javaSkills=javaSkills;
	}

	public String[] getJavaSkills() {
		return javaSkills;
	}

	public void setJavaSkills(String[] javaSkills) {
		this.javaSkills = javaSkills;
	}
	
	

}
