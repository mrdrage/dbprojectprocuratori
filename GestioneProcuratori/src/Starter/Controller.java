package Starter;

import java.sql.SQLException;

import java.sql.Connection;

import DBconfig.DBConnection;

public class Controller {

	public static void main(String[] args) {
		
 
		try {
			DBConnection dbconnection = DBConnection.getInstance();
			 
			Connection conn = dbconnection.getConnection(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
