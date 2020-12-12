package com.videos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This is the Database connection creation class . Java Database Connection
 * using Singleton pattern Class
 **/

public class DBConnection {

	static Connection connection = null;

	public DBConnection() {
	}

	public static Connection getDBConnection() throws SQLException {

		try {
			if (connection == null) {

				// Load the mysql driver
				Class.forName("com.mysql.jdbc.Driver");

				// Get the connection
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AKST", "root", "Tharindu@1");

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return connection;

	}

	public static Connection getDBConnection1() {

		return null;
	}

}
