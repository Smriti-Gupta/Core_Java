package Advance;
import java.sql.*;
public class TestMySql2 {

			public static void main(String[] args) 
		
		{
			try
			{
				//Register the Driver class
				
				Class.forName("com.mysql.jdbc.Driver");
				//creating Connection object
				System.out.println("connecting to database");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","admin");
				// creating statement object
				//Remember Connection & Statement both are interface
				System.out.println("creating Statement");
				
				Statement stmt = con.createStatement();
				
				//UPDATE TABLE ENTRY
				PreparedStatement stmt2 = con.prepareStatement("update employee set name=? where id =?");
				stmt2.setString(1,"chinky");
				stmt2.setInt(2,2);
				int j=stmt2.executeUpdate();
				System.out.println(j+" records updated");
				
			
			/*	while(rs.next())
			{
				System.out.println("id =" + " " + rs.getInt(1) + " Name =" + " " + rs.getString(2)+ " " + "Age =" + " " + rs.getInt(3));
				}*/
				 // close connection
				//rs.close();
				stmt.close();
				con.close();
			}
			catch(SQLException ex)
			{
				System.out.println(ex);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}


