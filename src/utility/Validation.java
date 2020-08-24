package utility;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import controller.Main;
import dao.AdminCrud;


public class Validation {
	
		@SuppressWarnings("resource")
		public static void validation() throws IOException, SQLException {
			System.out.println("Enter your User Id : ");// LOGIN DETAILS FOR THE ADMIN
			Scanner sc = new Scanner(System.in);
			String email = sc.nextLine();
			System.out.println("Enter your Password : ");
			Scanner sc1 = new Scanner(System.in);
			String password = sc1.nextLine();
			// IF THE GIVEN INPUT AND THE BELOW DETAILS ARE EQUALS THEN ADMIN GETS LOGIN 
			if("charith.charri@gmail.com".equals(email) && "charith".equals(password)) {
				System.out.println("\t\tLogin Successful");
				Validation.Adminmenu();
				}
			else {
			System.out.println("Login Failes");
			System.out.println("\n");
			System.out.println("Enter the correct details");
			 Validation.validation() ;
		}
			

		}
		
public static void Adminmenu() throws SQLException, IOException {
//admin menu displayed for the admin after login
	System.out.println("1.  USER DETAILS");
	System.out.println("2.  HR DETAILS");
	System.out.println("3.  Exit");
	System.out.println("========================================================");
	System.out.println("ENTER AN OPTION");
	System.out.println("========================================================");
	Scanner in1 = new Scanner(System.in);
	char ch11 = in1.next().charAt(0);
	switch(ch11) {
	case '1':AdminCrud.Menu();
	break;
	case '2':AdminCrud.HRMenu();
	break;
	case '3':
		System.out.println("*******************thank you *****************************");
		break;
			}
		 
	
}
}
		
		
		