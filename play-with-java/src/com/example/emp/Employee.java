package com.example.emp;

/**
 * 
 *  Dev-1
 * 
 */

public class Employee {
	
	// variables
	public static final String COMPANY_NAME="HSBC";
	public static String tnrName;
	private int id; // 0
	private String name; // null
	private double salary; // 0.0
	// constructor
	public Employee(int id) {
		this(id,null,0.0);
	}
	public Employee(int id,String name) {
		this(id,name,0.0);
	}
	public Employee(int id,String name,double salary) {
		if(id>0) {
			this.id=id;
		}
		if(name!=null) {
			this.name=name;
		}
		if(salary>0 && salary<10000.00) {
			this.salary=salary;
		}
	}
	// accessor(set&get) methods
	public int getId() {
		return this.id;
	}
	public void setName(String name) {
		if(name!=null) {
			this.name=name;
		}
	}
	public String getName() {
		return this.name;
	}
	public void setSalary(double salary) {
		if(salary>0 && salary<10000) {
			this.salary=salary;
		}
	}
	public double getSalary() {
		return this.salary;
	}
	
}
