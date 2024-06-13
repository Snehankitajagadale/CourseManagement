package com.adjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteRecord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/168batch", "root","root");
			Statement stmt=connection.createStatement();
			int status =stmt.executeUpdate("delete from employee where id=4");
			if(status>0) {
				System.out.println("Data is deleted sucessfully");
			}else {
				System.out.println("Data is Not deleted ");
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
