package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {

	// url & database, username, password ---> you can put these variables in a separate class
	public static final String URL = "jdbc:mysql://localhost:3306/dummy";
	public static final String USER = "root";
	public static final String PASS = "root";

	private Connection conn;
	private Statement stmt;

	// open up the connection to the url, pass in the credentials too
	public Sql() throws SQLException {
		//if you put the variables in a different class use the below line
//		conn = DriverManager.getConnection(classname.URL, classname.USER, classname.PASS);
		//------------
		conn = DriverManager.getConnection(URL, USER, PASS);//if you put the variables in this class use this line
		this.stmt = conn.createStatement();
	}

	// CREATE
	public void create(String field1, String field2) throws SQLException {
		String insert = "INSERT INTO table1(field1, field2) VALUES('" + field1 + "','" + field2 + "');";
		stmt.executeUpdate(insert);// executeUpdate - make changes to the database, put data into the database
	}

	// UPDATE - use executeUpdate
	public void update(int id, String field1, String field2) throws SQLException {
		String update = "UPDATE table1 SET field1='" + field1 + "', field2='" + field2 + "' WHERE ID=" + id + ";";
		stmt.executeUpdate(update);
	}

	// READ - use executeQuery --> get data from the database
	public void readAll() throws SQLException {
		String read = "SELECT * FROM table1;";
		ResultSet rs = stmt.executeQuery(read);

		while (rs.next()) {
			System.out.println("ID = " + rs.getInt("ID") + ", field1 = " + rs.getString("field1") + ", field2 = "
					+ rs.getString("field2"));
		}

	}

	// DELETE - use executeUpdate
	public void delete(int id) throws SQLException {
		String delete = "DELETE FROM table1 WHERE ID=" + id + ";";
		stmt.executeUpdate(delete);
	}

	// method called to close the connection
	public void close() throws SQLException {
		conn.close();
	}

}
