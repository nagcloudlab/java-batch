package io;

import java.io.FileWriter;
import java.io.IOException;

public class Ex5 {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter=new FileWriter("menu.txt", true);
		fileWriter.write("poha\n");
		fileWriter.write("dosa\n");
		fileWriter.flush();
		fileWriter.write("meals\n");
		fileWriter.close();
		//fileWriter.write("abc\n");
		
		
	}

}
