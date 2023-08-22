package com.example;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		
//		String s="hsbc";
//		s.concat("-pune");
//		
//		System.out.println(s);
		
		
		StringBuffer stringBuffer=new StringBuffer("a");
		stringBuffer.append("b");

		
		String s=stringBuffer.toString();
		System.out.println(s);
		
		StringBuilder stringBuilder=new StringBuilder("a");
		stringBuilder.append("b");
		
		
		
	}

}
