package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import utility.ConnectionManager;

public class WIPROdao {
	public  void RetrieveHRwipro() throws SQLException, IOException {
		Scanner in = new Scanner(System.in);
		String sql = "SELECT * FROM WIPRO";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println("\t"+"VACANCY: "+rs.getString(1)+"\n"+"JOBROLE: "+rs.getString(2)+" \n"+"QUALIFICATION :: "+rs.getString(3)+"\n"+"SKILLS: "+rs.getString(4));
		}
		
	}

	public void insertpost() throws IOException, SQLException {
		Scanner in = new Scanner(System.in);
		Connection con = ConnectionManager.getConnection();
		String sql = "INSERT INTO WIPRO(VACANCIES,JOBROLE,QUALIFICATION,SKILLS)VALUES(?,?,?,?)";
		System.out.println("enter vaccancies");
		int vacancies =in.nextInt();
		System.out.println("enter jobrole");
		String jobrole = in.next();
		System.out.println("enter qualification");
		String qualification = in.next();
		System.out.println("enter skills");
		String skills = in.next();
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1,vacancies);
		st.setString(2,jobrole);
		st.setString(3,qualification);
		st.setString(4,skills);
		st.executeUpdate();
		st.close();
	}
	public void deletepost() throws IOException, SQLException {
		Scanner in = new Scanner(System.in);
		Connection con = ConnectionManager.getConnection();
		String sql = "DELETE FROM WIPRO WHERE JOBROLE=?";
		PreparedStatement st = con.prepareStatement(sql);
		System.out.println("enter jobrole");
		String jobrole = in.next();
		st.setString(1,jobrole);
		st.executeUpdate();
		st.close();
	}
	public void updatepost() throws IOException, SQLException {
		Scanner in = new Scanner(System.in);
		Connection con = ConnectionManager.getConnection();
		String sql = "UPDATE   WIPRO SET VACANCIES=?";
		System.out.println("enter VACANCIES");
		String vacancies = in.next();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,vacancies);
		st.executeUpdate();
		st.close();
	}
	}