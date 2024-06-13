package com.adjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AllRecordfetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/168batch", "root","root");
			Statement stmt=connection.createStatement();
			ResultSet rs =stmt.executeQuery("select * from employee");
			while(rs.next()) {
				int id=rs.getInt("id");
				String fname=rs.getString("fname");
				String mobileno=rs.getString("mobileno");
				System.out.println("Id is:"+id+ "fname is:"+fname+"mobile no is:"+mobileno);
			}
			rs.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
