package com.example;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

	static String[] advices = { "eat", "sleep", "play", "walk", "run" };

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(8080);
		while (true) {
			Socket socket = serverSocket.accept();
			int idx = (int) (Math.floor(Math.random() * advices.length-1)) ;
			String advice = advices[idx];
			System.out.println(advice);
			OutputStream outputStream = socket.getOutputStream();
			ObjectOutputStream oos=new ObjectOutputStream(outputStream);
			oos.writeObject(advice);
			oos.flush();
		}

	}

}
