package io;

import java.io.Serializable;

public class Company implements Serializable {
	
	private String name;

	public Company(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
