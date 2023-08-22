package com.example;

import java.util.HashMap;
import java.util.Map;

public class Ex5 {
	public static void main(String[] args) {

		String[] csvReport = { "E1,IT,1000", "E2,IT,2000", "E3,HR,4000", "E4,SALES,3000" };
		
		Map<String, Double> map=new HashMap<>(); // dictionary data structure
		
		for (int i = 0; i < csvReport.length; i++) {
			String record=csvReport[i];
			String[] tokens=record.split(",");
			String depName=tokens[1];
			double salary=Double.parseDouble(tokens[2]);
			if(map.containsKey(depName)) {
				map.put(depName, map.get(depName)+salary);
			}else {
				map.put(depName, salary);
			}
		}
		
		System.out.println(map);

	}

}
