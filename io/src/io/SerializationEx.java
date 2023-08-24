package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) {

		Company company=new Company("HSBC");
		Product product = new Product(123, "Insurance", 1000.00,company);

		try {
			FileOutputStream fos = new FileOutputStream("product.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(product);
			oos.close();
			fos.close();
			System.out.println("Obj serialized..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
