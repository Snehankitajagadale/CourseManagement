package com.adjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/168batch", "root","root");
			Statement stmt=connection.createStatement();
			int status =stmt.executeUpdate("insert into employee(fname,mobileno)values('neha','8780908978')");
			if(status>0) {
				System.out.println("Data is inserted sucessfully");
			}else {
				System.out.println("Data is Not inserted ");
			}
			
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
