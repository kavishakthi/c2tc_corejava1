package com.kavs.jdbcprograms;
import java.sql.*;

public class JdbcSample {

	public static void main(String[] args) {
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app","root","Kavss@008");
			Statement st = conn.createStatement();
			
			String str = "select BookName,price,qty from Books";
			System.out.println("Sql statement is : " + str);
			
			//resultset used to display 
			ResultSet res = st.executeQuery(str);
			System.out.println("the record are: ");
			
			int rowcount = 0;
			while(res.next()) {
				String title = res.getString("BookName");
				int price = res.getInt("price");
				int qty = res.getInt("qty");
				System.out.println(" "+ title + " "+ price +" "+ qty);
				++rowcount;
			}
			
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
