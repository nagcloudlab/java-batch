package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desrialization {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("product.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Product product=(Product)ois.readObject();
			System.out.println(product);
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
