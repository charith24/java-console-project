package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utility.ConnectionManager;
import utility.HRDetails;
import utility.UserDetails;
import utility.Validation;

public class AdminCrud {
		
		public static  void Menu() throws SQLException, IOException {
			//menu displayed after selecting user details
			System.out.println("A.     ALL REGISTERED USERS");
			System.out.println("B.     ADD USERS");
			System.out.println("C.     DELETE USERS");
			System.out.println("D.     UPDATE USERS");
			System.out.println("E.      BACK");
			System.out.println("========================================================");
			System.out.println("ENTER AN OPTION");
			System.out.println("========================================================");
			Scanner in11 = new Scanner(System.in);
			char ch111 = in11.next().charAt(0);
			switch(ch111) {
			case 'A':
				System.out.println("ALL REGISTERED USERS");
				 UserDetails.RetrieveUser();//retrieve all the registered user from the database
				 AdminCrud.Menu();
				break;
		
			case 'B':
				AdminCrud.insertUser();//insert the users by admin
				AdminCrud.Menu();
				break;
			case 'C':
		
				AdminCrud.deleteUser();//delete users by the admin
				AdminCrud.Menu();
				break;
			case 'D':
				AdminCrud.updateUser();//update username by admin
				AdminCrud.Menu();
				break;
			case 'E':
				Validation.Adminmenu();
				break;
				
			default:
				System.out.println("ENTER A VALID OPTION");
				AdminCrud.Menu();
			
		}}
		
		
		//insertion method for the user
		public static  void insertUser() throws SQLException, IOException{
			Scanner in = new Scanner(System.in);
			Connection con = ConnectionManager.getConnection();
			String sql = "INSERT INTO USERDETAILS(FIRSTNAME,LASTNAME,USERNAME,PASSWORD,EMAIL)VALUES(?,?,?,?,?)";
			System.out.println("enter FIRSTNAME");
			String firstname =in.next();
			System.out.println("enter LASTNAME");
			String lastname = in.next();
			System.out.println("enter USERNAME");
			String username = in.next();
			System.out.println("enter PASSWORD");
			String password = in.next();
			System.out.println("enter EMAIL");
			String email = in.next();
			System.out.println("********************ADDED USER SUCCESSFULL************");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,firstname);
			st.setString(2,lastname);
			st.setString(3,username);
			st.setString(4,password);
			st.setString(5,email);
			st.executeUpdate();
			st.close();
			AdminCrud.Menu();
		}
		//deletion method for the user
		public static  void deleteUser() throws IOException, SQLException {
			Scanner in = new Scanner(System.in);
			Connection con = ConnectionManager.getConnection();
			String sql = "DELETE FROM USERDETAILS WHERE USERNAME=?";
			PreparedStatement st = con.prepareStatement(sql);
			System.out.println("enter USERNAME");
			String username = in.next();
			st.setString(1,username);
			st.executeUpdate();
			System.out.println("********************DELETED USER SUCCESSFULL************");
			st.close();
		}
		//updation for the user
		public static void updateUser() throws IOException, SQLException {
			Scanner in = new Scanner(System.in);
			Connection con = ConnectionManager.getConnection();
			String sql = "UPDATE  USERDETAILS SET USERNAME=?";
			System.out.println("enter USERNAME");
			String username = in.next();
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,username);
			st.executeUpdate();
			System.out.println("********************UPDATED USER SUCCESSFULL************");
			st.close();
		}
	
	
	
	
	
	
	
	
	

		//menu displayed after selection of HR DETAILS
		public static void HRMenu() throws SQLException, IOException {
			System.out.println("A.     ALL REGISTERED HR's");
			System.out.println("B.     ADD HR");
			System.out.println("C.     DELETE HR");
			System.out.println("D.     UPDATE HR");
			System.out.println("E.      BACK");
			System.out.println("========================================================");
			System.out.println("ENTER AN OPTION");
			System.out.println("========================================================");
			Scanner in111 = new Scanner(System.in);
			char ch1111 = in111.next().charAt(0);
			switch(ch1111) {
			case 'A':
				HRDetails.RetrieveHR();//RETRIEVE ALL THE HR DETAILS FROM THE DATABASE
				AdminCrud.HRMenu();
				break;
		
			case 'B':
				
				AdminCrud.insertHR();//INSERTION METHOD FOR HR's BY ADMIN
				AdminCrud.HRMenu();
				break;
			case 'C':
				AdminCrud.deleteHR();// DELETION METHOD FOR HR's BY ADMIN
				AdminCrud.HRMenu();
				break;
			case 'D':
				AdminCrud.updateHR();//UPDATION METHOD FOR HR's BY ADMIN
				AdminCrud.HRMenu();
				break;
				
			case 'E':
				Validation.Adminmenu();//GET BACK TO THE PREVIOUS MENU
				break;
				default:
					System.out.println("ENTER A VALID OPTION");
					AdminCrud.HRMenu();
			
			}
			
			
		}
		
		
		// INSERTION METHOD TO ADD HR
		public static void insertHR() throws SQLException, IOException{
			Scanner in = new Scanner(System.in);
			Connection con = ConnectionManager.getConnection();
			String sql = "INSERT INTO HR(COMPANYNAME,HRNAME,HREMAIL,ID,PASSWORD)VALUES(?,?,?,?,?)";
			System.out.println("enter COMPANY-NAME");
			String companyname =in.next();
			System.out.println("enter HRNAME");
			String hrname = in.next();
			System.out.println("enter HREMAIL");
			String hremail = in.next();
			System.out.println("enter ID");
			String id = in.next();
			System.out.println("enter PASSWORD");
			String password = in.next();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,companyname);
			st.setString(2,hrname);
			st.setString(3,hremail);
			st.setString(4,id);
			st.setString(5,password);
			st.executeUpdate();
			st.close();
		
	}
		// DELETION METHOD TO ADD HR
		public static void deleteHR() throws IOException, SQLException {
			Scanner in = new Scanner(System.in);
			Connection con = ConnectionManager.getConnection();
			String sql = "DELETE FROM HR WHERE HRNAME=?";
			PreparedStatement st = con.prepareStatement(sql);
			System.out.println("enter HRNAME");
			String hrname = in.next();
			st.setString(1,hrname);
			st.executeUpdate();
			st.close();
		}
		// UPDATION METHOD TO ADD HR
		public  static void updateHR() throws IOException, SQLException {
			Scanner in = new Scanner(System.in);
			Connection con = ConnectionManager.getConnection();
			String sql = "UPDATE  TCS SET HRNAME=?";
			System.out.println("enter HRNAME");
			String hrname = in.next();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,hrname);
			st.executeUpdate();
			st.close();
		}
	}



