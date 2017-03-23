package Advance;
import java.util.*;
import java.io.*;
import java.sql.*;
public class TestMySql1 {
	
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
			
			//Statement is responsible for Executing Query 
			//ResultSet rs = stmt.executeQuery("insert into employee values(?,?)");
			PreparedStatement stmt1 = con.prepareStatement("insert into employee values(?,?,?)");
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter ID");
			int id = Integer.parseInt(b.readLine());
			System.out.println("Enter NAME");
			String Name = b.readLine();
			System.out.println("Enter AGE");
			int age = Integer.parseInt(b.readLine());
			stmt1.setInt(1,id);
			stmt1.setString(2,"Name");
			stmt1.setInt(3,age);
			int i=stmt1.executeUpdate();
			System.out.println(i+" records inserted");

			
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
