package com.kavs.jdbcprograms;
import java.sql.*;

public class PreparedStatement {

	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app","root","Kavss@008");
			Statement st = con.createStatement();
			
			//Inserting 
			
//			String Insert = "insert into Books values(3, 'farAway', 120, 3);";
//			System.out.println("The statement is : "+ Insert);
//			int count = st.executeUpdate(Insert);
//			System.out.println(count + " records inserted");
			
			//Deleting 
			
//			String delete = "delete from Books where BookId = 3";
//			System.out.println("The statement is : "+ delete);
//			int countdel = st.executeUpdate(delete);
//			System.out.println(countdel + " records deleted.");
			
			//updating
			
//			String update = "update Books set price=170 where BookId = 2";
//			System.out.println("The statement is : "+ update);
//			int countupd = st.executeUpdate(update);
//			System.out.println(countupd + " records updated.");
			
			//Displaying
			
			String select = "select * from Books";
			ResultSet res = st.executeQuery(select);
			while(res.next())
			{
				System.out.println(res.getInt("BookId"));
				System.out.println(res.getString("BookName"));
				System.out.println(res.getInt("price"));
				System.out.println(res.getInt("qty"));
				System.out.println("----------------");
			}
		}
		
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
