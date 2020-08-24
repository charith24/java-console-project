package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import dao.Login;
import dao.RegisterOperations;
import dao.Userlogin;
import model.LoginPojo;
import model.RegisterPojo;
import utility.ACCENTUREhrvaliation;
import utility.HRDetails;
import utility.TCShrvalidation;
import utility.TECHMAHINDRAhrvalidation;
import utility.UserDetails;
import utility.Validation;
import utility.WIPROhrvalidation;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Validation v = new Validation();
		RegisterOperations ro = new RegisterOperations();
		Userlogin ab = new Userlogin();
		model.RegisterPojo registerpojo = null;
		model.LoginPojo loginpojo = new LoginPojo();
		Login login = new Login();
		TCShrvalidation tcsv = new TCShrvalidation();
		 WIPROhrvalidation wiprov = new  WIPROhrvalidation();
		 ACCENTUREhrvaliation accenturev = new ACCENTUREhrvaliation();
		 TECHMAHINDRAhrvalidation techmahindrav = new TECHMAHINDRAhrvalidation();
		
		 
		System.out.println("\n");
		System.out.println("========================================================");
		System.out.println("                     JOB-PORTAL                          ");
		System.out.println("========================================================");
		System.out.println("\n");
		System.out.println("1.  ADMIN");
		System.out.println("2.  USER");
		System.out.println("3.  HR");
		System.out.println("========================================================");
		System.out.println("ENTER AN OPTION");
		System.out.println("========================================================");
		Scanner in = new Scanner(System.in);
		char ch1 = in.next().charAt(0);
		int ch;
		switch(ch1 ) {
		case '1':
			v.validation();//ADMIN VAIDATION TO LOGIN 
			break;
		case '2': //MENU FOR THE USER 
			Scanner sc = new Scanner(System.in);
			System.out.println("\n");
			System.out.println("1.  REGISTER");
			System.out.println("2.  LOGIN");
			System.out.println("========================================================");
			System.out.println("ENTER AN OPTION");
			System.out.println("========================================================");
			char ch1111 = sc.next().charAt(0);
			switch(ch1111) {
			case '1'://REGISTRATION FORM FOR THE USER 

				System.out.println("enter your first name: ");
				String firstname = br.readLine();
				System.out.println("enter your last name: ");
				String lastname = br.readLine();
				System.out.println("enter your user name:");
				String username = br.readLine();
				System.out.println("enter your Email :");
				String email = br.readLine();
				System.out.println("enter your Password:");
				String password = br.readLine();
				registerpojo = new RegisterPojo(firstname,lastname,email);
				registerpojo.setFirstname(firstname);
				registerpojo.setLastname(lastname);
				registerpojo.setUsername(username);
				registerpojo.setPassword(password);
				registerpojo.setEmail(email);
				RegisterOperations.addUser(registerpojo);
				System.out.println("*********************Registration Succesfull****************");
				login.login(registerpojo);//LOGIN FORM FOR THE USER 
				Menu.options(null);
				break;
			
			case '2':
				Scanner sc1 =  new Scanner(System.in);
				System.out.println("enter your user name:");
				String name = sc1.next();
				System.out.println("enter your Password:");
				String pass = sc1.next();			
				 RegisterPojo rj = new RegisterPojo(name,pass);
				 login.login(rj);//LOGIN FORM FOR THE EXISTING USER 
		
			
			break;
			}
		case '3':

			HRMenu.HRmainmenu();//LOGIN FORM FOR THE HR 
			
		default:
			System.out.println("ENTER A VALID OPTION");
			Main.main(args);// the same MENU will be displayed
			
		}
	}
	}
