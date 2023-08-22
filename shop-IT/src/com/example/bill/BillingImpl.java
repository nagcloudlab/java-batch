package com.example.bill;

import com.example.pm.PriceMatrix;
import com.example.pm.PriceMatrixFactory;

public class BillingImpl {

	private PriceMatrix priceMatrix;

	// Dependency Injection
	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix; 
		System.out.println("BillingImpl object created..");
	}

	public double getTotalPrice(String[] cart) {
		double totalPrice = 0.0;
		// PriceMatrix priceMatrix=new PriceMatrix_V1();
		// PriceMatrix priceMatrix=PriceMatrixFactory.getPriceMatrix("1");
		for (int i = 0; i < cart.length; i++) {
			String itemCode = cart[i];
			double price = priceMatrix.getPrice(itemCode);
			totalPrice += price;
		}
		return totalPrice;

	}

}
