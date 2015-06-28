package cn;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowTables {
	Connection connection = null;
	/**
	 * @param args
	 * @author leon
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowTables showTables = new ShowTables();
		ResultSet resultSet = showTables.listDB();
		System.out.println("Sucess Load Database!");
		try {
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	/*public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			String userString = "root";
			String passwordString = "password";
			connection = DriverManager.getConnection(url,userString,passwordString);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}*/
	
	public ResultSet listDB() {
		String sql = "SHOW TABLES;";
		try {
			GetConnection gConnection = new GetConnection("test");
			connection = gConnection.getConnection();
			
			//connection = getConnection();
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet resultSet = statement.executeQuery(sql);
			return resultSet;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}

}
