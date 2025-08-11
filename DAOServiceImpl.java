package com.studentapp.model;

import java.sql.*;

public class DAOServiceImpl implements DAOService {
  private Connection con;
  private Statement stmnt;
  
  
	@Override
	public void connectDB() {
      try {
    	  Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug_db","root","test");
		stmnt  = con.createStatement();
	} catch (Exception e) {
    e.printStackTrace();
	}
	}

	@Override
	public void createInquiry(String name, String email, String mobile) {
      try {
    	  stmnt.executeUpdate("insert into inquiry values('"+name+"','"+email+"','"+mobile+"')");
	} catch (Exception e) {
         e.printStackTrace();
	}
	}

	@Override
	public void deleteInquiry(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateInquiry() {
		// TODO Auto-generated method stub

	}

	@Override
	public ResultSet listInquiry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("Select * from login where email='"+email+"'and password='"+password+"'");
		    return result.next();
		} catch (Exception e) {
		 e.printStackTrace();
		}		
return false;
	}

}
