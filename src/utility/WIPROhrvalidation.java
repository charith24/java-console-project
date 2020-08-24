package utility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import controller.HRMenu;

public class WIPROhrvalidation {

		@SuppressWarnings("resource")
		public void validation() throws IOException, SQLException {
			System.out.println("Enter your  Id : ");
			Scanner sc = new Scanner(System.in);
			String email = sc.nextLine();
			System.out.println("Enter your Password : ");
			Scanner sc1 = new Scanner(System.in);
			String password = sc1.nextLine();
			if("WIPROHRLOGININ".equals(email) && "998877".equals(password)) {
				System.out.println("\t\tLogin Successful");
				HRMenu.wiproHrMenu();
			}
				else {
					System.out.println("Login Failes");
					System.out.println("ENTER THE VALID DETAILS ");
					validation();
				}
}
}