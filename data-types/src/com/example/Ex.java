package com.example;

import java.util.Scanner;

// ssn => XXX-XX-XXXX

public class Ex {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ssn");
		String ssn = scanner.nextLine();
		boolean isValid = true;
		
		// way-1
		if (ssn.length() == 11) {
			for (int i = 0; i < 11; i++) {
				char c = ssn.charAt(i);
				if (i == 3 || i == 6) {
					if (c != '-') {
						isValid = false;
						break;
					}
				} else {
					if ("1234567890".indexOf(c) == -1) {
						isValid = false;
						break;
					}
				}
			}
		}else {
			isValid=false;
		}
		
		//way-2
		//isValid=ssn.matches("\\d{3}-\\d{2}-\\d{4}");
		
		
		if(isValid) {
			System.out.println("Valid ssn");
		}else {
			System.out.println("invalid ssn");
		}

		scanner.close();

	}

}
