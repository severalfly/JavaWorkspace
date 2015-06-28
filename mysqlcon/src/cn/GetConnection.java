package cn;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	private Connection connection = null;
	private String userString = "root";
	private String passwordString = "password";
	
	public GetConnection() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			
			connection = DriverManager.getConnection(url, userString, passwordString);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public  GetConnection(String databaseNameString) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/" + databaseNameString;
			connection = DriverManager.getConnection(url, userString, passwordString);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		return connection;
	}
}
