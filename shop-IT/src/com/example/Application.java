package com.example;

import com.example.bill.BillingImpl;
import com.example.pm.PriceMatrix;
import com.example.pm.PriceMatrixFactory;

public class Application {

	public static void main(String[] args) {

		PriceMatrix priceMatrixV1=PriceMatrixFactory.getPriceMatrix("1");
		PriceMatrix priceMatrixV2=PriceMatrixFactory.getPriceMatrix("2");
		
		BillingImpl billing = new BillingImpl(priceMatrixV1);
		
		System.out.println("-".repeat(50));

		String[] cart1 = { "123", "456", "789" };

		double totalPrice = billing.getTotalPrice(cart1);
		System.out.println("cart1 total-price: " + totalPrice);

		String[] cart2 = { "123", "456"};
		totalPrice=billing.getTotalPrice(cart2);
		System.out.println("cart2 total-price: " + totalPrice);
		
		System.out.println("-".repeat(50));
		
	}

}
