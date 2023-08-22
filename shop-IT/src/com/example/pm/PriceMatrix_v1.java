package com.example.pm;

public class PriceMatrix_v1 implements PriceMatrix {
	
	public PriceMatrix_v1() {
		System.out.println("PriceMatrix_v1 object created..");
	}
	
	public double getPrice(String itemCode){
		return 200.00;
	}

}
