package cn;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class CreateMySQL {
	java.sql.Connection connection;
	private String passWord;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Success Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String passWord = "password";
			DriverManager.getConnection(url, user, passWord);
			System.out.println("Success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
}
