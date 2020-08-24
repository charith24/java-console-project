package utility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.RegisterPojo;

public class UserDetails {
	public static void RetrieveUser() throws SQLException, IOException {
		String sql = "SELECT * FROM USERDETAILS";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println("\t"+"FIRTSNAME-"+rs.getString(1)+"--- "+"LASTNAME-"+rs.getString(2)+"--- "+"USERNAME-"+rs.getString(3)+"--- "+"PASSWORD-"+rs.getString(4)+"--- "+"EMAIL-"+rs.getString(5));
		}
		System.out.println("\n");
		
	}
public RegisterPojo student(RegisterPojo student) throws IOException, SQLException {
	Connection con = ConnectionManager.getConnection();
	String sql = "SELECT * FROM USERDETAILS";
	PreparedStatement st  = con.prepareStatement(sql);
	ResultSet rs = st.executeQuery(sql); 
	while(rs.next()) {
		if(rs.getString(3).equals(student.getUsername())&&rs.getString(4).equals(student.getPassword())) {
		RegisterPojo test = new RegisterPojo(rs.getString(1),rs.getString(2),rs.getString(5));
		return test;
		}
	}
	return null;
}
}
