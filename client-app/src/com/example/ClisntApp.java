package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClisntApp {
	
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		
		Socket socket=new Socket("localhost", 8080);
		InputStream inputStream= socket.getInputStream();
		ObjectInputStream ois=new ObjectInputStream(inputStream);
		String advice=(String)ois.readObject();
		System.out.println("server says "+advice);
		socket.close();
		
	}

}
