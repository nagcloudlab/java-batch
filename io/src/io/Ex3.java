package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("/Users/nag/trainings/hsbc/io/file1.txt"); // character-stream to file
//		int ucv=-1;
//		while((ucv=fr.read())!=-1) {
//			System.out.print((char)ucv);
//		}
//		
//		fr.close();
		
		
		
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fr.close();

	}

}
