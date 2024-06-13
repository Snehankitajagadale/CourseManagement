package com.adjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/168batch", "root","root");
			Statement stmt=connection.createStatement();
			int status =stmt.executeUpdate("update employee set fname='snehankita' where id=1");
			if(status>0) {
				System.out.println("Data is updated sucessfully");
			}else {
				System.out.println("Data is Not updated ");
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
