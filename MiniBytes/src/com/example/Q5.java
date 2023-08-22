package com.example;

class Product {
	String name;
	double price;

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}

public class Q5 {

	public static void main(String[] args) {

		// String => Primitive
		String s = "123";
		int i = Integer.parseInt(s);

		// Primitive ==> String
		int ii = 123;
		String ss = String.valueOf(ii);

		// Object => String
		Product product = new Product();
		product.name = "Laptop";
		product.price = 100.00;

		String productString = product.toString();
		System.out.println(productString);

		// Primitive => WRAPPER-Object
		int iii = 12;
		Integer obj = iii;

		// Wrapper-object ==> primitive
		int j = obj;

	}

}
