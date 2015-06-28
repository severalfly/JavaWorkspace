package cn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;





public class CreateMySQL {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select * from MyClass";
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Success Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String passWord = "password";
			Connection connection =  DriverManager.getConnection(url, user, passWord);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Success   " + resultSet);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
}
