package com.example.pm;

public class PriceMatrixFactory {

	public static PriceMatrix getPriceMatrix(String version){
		
		if(version.equals("1")) {
			PriceMatrix_v1 priceMatrix_v1=new PriceMatrix_v1();
			return priceMatrix_v1;
		}
		
		if(version.equals("2")) {
			PriceMatrix_v2 priceMatrix_v2=new PriceMatrix_v2();
			return priceMatrix_v2;
		}
		
		return null;
		
		
		
	}

}
