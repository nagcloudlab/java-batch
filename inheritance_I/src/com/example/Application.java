package com.example;

public class Application {
	
	public static void main(String[] args) {
		
		JavaEmployee javaEmployee=new JavaEmployee(123, "E1", 100.00, new String[] {"Java","Spring"});
		
		System.out.println(javaEmployee.getId());
		System.out.println(javaEmployee.getName());
		System.out.println(javaEmployee.getJavaSkills());
		
	}

}
