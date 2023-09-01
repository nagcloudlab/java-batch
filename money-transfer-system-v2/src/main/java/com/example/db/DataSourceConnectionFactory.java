package com.example.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSourceConnectionFactory {
	private static Properties properties = new Properties();
	static {
//		try {
//			FileInputStream fis = new FileInputStream("WEB-INF/db.properties");
//			properties.load(fis);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	static {
		try {
			//Class.forName(properties.getProperty("db.driver"));
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		//String url = properties.getProperty("db.url");
		String url="jdbc:mysql://localhost:3306/bankdb";
		//String user = properties.getProperty("db.user");
		String user="root";
		//String password = properties.getProperty("db.password");
		String password="root1234";
		return DriverManager.getConnection(url, user, password);
	}
}