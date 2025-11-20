package org.jsp.updateApp;

import java.sql.*;

public class updateDemo {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			stmt=con.createStatement();
			stmt.executeUpdate("update btm.Student set name='anu' where id=2");
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			if(stmt!=null) {
				try {
					stmt.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Closed all the costly resources");
		}
	}
}
