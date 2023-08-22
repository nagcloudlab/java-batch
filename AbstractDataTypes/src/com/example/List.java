package com.example;

// year : 2003

public interface List extends Collection {
	
	void add(int index,String e);
	
	default String get(int index) {
		return null;
	}
	static void staMethod() {
		
	}

}
