package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dao.RegisterOperations;
import utility.ConnectionManager;

public class TCS {
		public static int Retrievetcs() throws SQLException, IOException {
			Scanner in = new Scanner(System.in);
			String sql = "SELECT * FROM TCS";
			Statement st = ConnectionManager.getConnection().createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println("\t"+"VACANCY: "+rs.getString(1)+"\n"+"JOBROLE: "+rs.getString(2)+" \n"+"QUALIFICATION :: "+rs.getString(3)+"\n"+"SKILLS: "+rs.getString(4));
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("1.  Apply");
		
			System.out.println("2.  Back");
			
			char ch0 = sc.next().charAt(0);

			switch(ch0) {
			case '1' :
				System.out.println("  Applied for the tcs job");
				break;
			case '2' :
				
				break;
				
			}
			return 1;
		}
		public static void Appliedtcs() throws SQLException, IOException {
			Scanner in = new Scanner(System.in);
			String sql = "SELECT * FROM TCSAPPLIED";
			Statement st = ConnectionManager.getConnection().createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println("\t"+"FIRSTNAME: "+rs.getString(1)+"------"+"LASTNAME: "+rs.getString(2)+"------"+"EMAIL :: "+rs.getString(3)+"------"+"APPLIED: "+rs.getString(4));
			}
			
		}

}
