package cn;

import java.sql.*;

public class My{
  public static void main(String args[]) {
    try {
      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
      System.out.println("Success loading Mysql Driver!");
    }
    catch (Exception e) {
      System.out.print("Error loading Mysql Driver!");
      e.printStackTrace();
    }
    try {
      Connection connect = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/test","root","password");
      System.out.println("Success connect Mysql server!");

      //select code
      Statement stmt = connect.createStatement();
      ResultSet rs = stmt.executeQuery("select * from MyClass");//t_auth为表的名称
       while (rs.next()) {
        System.out.println(rs.getString("name"));//auth_path是表t_auth的一个字段

      }

      //insert into code

      PreparedStatement Statement=connect.prepareStatement("INSERT INTO MyClass (sex, name) VALUES(?,?)");
      Statement.setString(1,"2");
      Statement.setString(2,"系统管理");
      Statement.executeUpdate();  
    }
    catch (Exception e) {
      System.out.print("get data error!");
      e.printStackTrace();
    }
  }
}