package cn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetTables {
    Connection conn = null;
    
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // ŒÓÔØMySQLÊýŸÝ¿âÇý¶¯
            String url = "jdbc:mysql://localhost:3306/test"; // ¶šÒåÓëÁ¬œÓÊýŸÝ¿âµÄurl
            String user = "root"; // ¶šÒåÁ¬œÓÊýŸÝ¿âµÄÓÃ»§Ãû
            String passWord = "password"; // ¶šÒåÁ¬œÓÊýŸÝ¿âµÄÃÜÂë
            conn = DriverManager.getConnection(url, user, passWord); // Á¬œÓÁ¬œÓ
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    // ÏÔÊŸÊýŸÝ¿â
public ResultSet listDB() {
    String sql = "show tables;"; // ¶šÒå²éÑ¯ÊýŸÝSQLÓïŸä
    try {
        conn = getConnection(); // »ñÈ¡ÊýŸÝ¿âÁ¬œÓ
        Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY); // ÊµÀý»¯Statement¶ÔÏó
        ResultSet rs = stmt.executeQuery(sql); // ÖŽÐÐ²éÑ¯SQLÓïŸä
        return rs;              //·µ»Ø²éÑ¯œá¹û
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        return null;
    }
}
    
    public static void main(String[] args) {
        GetTables tables = new GetTables();
        ResultSet rest = tables.listDB();
        System.out.println("ÊýŸÝ¿âdb_database17ÏÂµÄÊýŸÝ±íÓÐ£º");
        try {
            while (rest.next()) {
                System.out.println(rest.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
