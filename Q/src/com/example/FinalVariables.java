package com.example;

class Xyz {
	static int staVar1;
	final static int STA_VAR2 = 100;

	int insVar1;
	final int INSVAR1;
	
	public Xyz(int v) {
		this.INSVAR1=v;
	}

}

public class FinalVariables {

	public static void main(String[] args) {

		Xyz.staVar1 = 100;

		Xyz xyz = new Xyz(10);
		xyz.insVar1 = 100;
		
		final int LOCAL=10;

	}

}
