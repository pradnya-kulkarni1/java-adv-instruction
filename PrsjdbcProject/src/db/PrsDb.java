package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrsDb {
	public static Connection getConnection() throws SQLException 
	{
		String dbURL = "jdbc:mysql://localhost:3306/prsjava";
		String username = "prs_user";
		String password = "sesame";

		Connection conn = DriverManager.getConnection(dbURL, username, password);
		return conn;
	}

}