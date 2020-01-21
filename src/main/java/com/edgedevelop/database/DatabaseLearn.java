package com.edgedevelop.database;

import java.sql.*;

public class DatabaseLearn {

    public static void main(String[] args) {
    	
    	// demo is the database name
    	String url = "jdbc:mysql://localhost:3306/demo";
    	String userName = "edgedev";
    	String password = "vjzZTKu#C&H4W9KQlcrMZb8!KHIIg";
    	
    	
    	// INSERT DATA INTO DATABASE
    	try {
    		
    		// 1. Get a connection to database
    		Connection con1 = DriverManager.getConnection(url, userName, password);
    		
    		
    		// 2. Create a statement
    		Statement stmt1 = con1.createStatement();
    		
    		
    		// 3. Execute SQL query
    		String sqlInsert = "insert into employee"
    							+ " (last_name, first_name, email)"
    							+ " values ('Balabas', Ejerson, edge@email.com)";
    		
    		stmt1.executeUpdate(sqlInsert);
    		
    		
    		
    	} catch (Exception exc) {
    		
    		exc.printStackTrace();
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
//    	String selectAll = "Select * FROM employee";
//
//        try {
//        		
//            //1. Get a connection to a database
//        	Connection con = DriverManager.getConnection(url, userName, password);
//        	
//        	//2. Create a statement
//        	Statement stmt = con.createStatement();
//        	
//        	//3. Execute SQL query
//        	ResultSet myRs = stmt.executeQuery(selectAll);
//        	
//        	//4. Process the result set
//        	while(myRs.next()) {
//        		System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
//        	}
//
//        } catch (Exception exc) {
//
//            exc.printStackTrace();
//        }

    }

}
