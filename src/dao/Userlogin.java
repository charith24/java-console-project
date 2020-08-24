package dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.LoginPojo;
import model.RegisterPojo;
import utility.ConnectionManager;

public class Userlogin {

	public static boolean validate(RegisterPojo student) throws ClassNotFoundException, SQLException, IOException {
	String Username = student.getUsername();
	String Password = student.getPassword();

		ConnectionManager con = new ConnectionManager();
		Statement st  = con.getConnection().createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM USERDETAILS");
		while(rs.next()) {
			if(Username.equals(rs.getString("USERNAME")) && Password.equals("PASSWORD")){
				con.getConnection().close();
				return true;
			}
			else
			{
				con.getConnection().close();
				return true;
			}
		}
		
		return false;
	}
	
}
