package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import utility.ConnectionManager;


public class RegisterOperations {
	
public static void addUser(model.RegisterPojo registerpojo) throws ClassNotFoundException, SQLException, IOException {
		
		String Firstname = registerpojo.getFirstname();
		String Lastname = registerpojo.getLastname();
		String Username = registerpojo.getUsername();
		String Password = registerpojo.getPassword();
		String Email = registerpojo.getEmail();
		
		
		
		ConnectionManager cm = new ConnectionManager();
		String sql = "insert into USERDETAILS(FIRSTNAME,LASTNAME,USERNAME,PASSWORD,EMAIL)VALUES(?,?,?,?,?)";
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		
		
		st.setString(1,Firstname);
		st.setString(2,Lastname);
		st.setString(3,Username);
		st.setString(4,Password);
		st.setString(5,Email);
	st.executeUpdate();
	cm.getConnection().close();
	}
}