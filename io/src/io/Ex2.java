package io;

import java.io.File;
import java.io.IOException;

public class Ex2 {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("/Users/nag/trainings/hsbc/io/file1.txt");
		
		file.createNewFile();
		
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		System.out.println(file.exists());
		
	}

}
