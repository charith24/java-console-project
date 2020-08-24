package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dao.ACCENTUREdao;
import dao.TCSdao;
import dao.TECHMAHINDRAdao;
import dao.WIPROdao;
import utility.ACCENTUREhrvaliation;
import utility.ConnectionManager;
import utility.TCShrvalidation;
import utility.TECHMAHINDRAhrvalidation;
import utility.WIPROhrvalidation;

public class HRMenu {
	static TCShrvalidation tcsv = new TCShrvalidation();
	 static WIPROhrvalidation wiprov = new  WIPROhrvalidation();
	 static ACCENTUREhrvaliation accenturev = new ACCENTUREhrvaliation();
	 static TECHMAHINDRAhrvalidation techmahindrav = new TECHMAHINDRAhrvalidation();
	 //THIS IS THE HR MENU 
	public static void HRmainmenu() throws IOException, SQLException {
		System.out.println("A.  TCS");
		System.out.println("B.  WIPRO");
		System.out.println("C.  ACCENTURE");
		System.out.println("D.  TECHMAHINDRA");
		System.out.println("E.  Back");
		System.out.println("F.  EXIT");
		System.out.println("========================================================");
		System.out.println("ENTER AN OPTION");
		System.out.println("========================================================");
		Scanner SC = new Scanner(System.in);
		char ab1= SC.next().charAt(0);
		switch(ab1) {
		case 'A':
			tcsv.validation();//TCS HR WILL SELECT THIS OPTION AND GETS LOGIN
		break;
			
		case'B':
			
			wiprov.validation();//WIPRO HR WILL SELECT THIS OPTION AND GETS LOGIN

			break;
						
		case'C':
			
			accenturev.validation();//ACCENTURE HR WILL SELECT THIS OPTION AND GETS LOGIN
			
			break;
			
		case'D':
		
			
			techmahindrav.validation();//TECHMAHINDRA HR WILL SELECT THIS OPTION AND GETS LOGIN
			break;
		}
	
		}
	

	public static void tcsHrMenu() throws SQLException, IOException {
		//THIS MENU WILL BE DISPLAYED WHEN TCS HR LOGIN TO HIS PAGE
		WIPRO wipro = new WIPRO();
		TCSdao tcsdao = new TCSdao();
		 ACCENTUREdao accenturedao = new ACCENTUREdao();
		 TECHMAHINDRAdao techmahindradao = new TECHMAHINDRAdao();
		
		 TCShrvalidation tcshr = new TCShrvalidation();
			TCS tcs = new TCS();
			Scanner sc= new Scanner(System.in);
			System.out.println("1.   VIEW POSTS");
			System.out.println("2.  Add a job post");
			System.out.println("3.  delete a job post");
			System.out.println("4.  update a job post");
			System.out.println("5.   applied list  ");
			System.out.println("6.    BACK  ");
			System.out.println("7.   Exit");
		
			Scanner in1 = new Scanner(System.in);
			char ch1 = in1.next().charAt(0);
			switch(ch1) {
			case '1':
		
				tcsdao.RetrieveHRtcs();//THIS METHOD IS TO SEE WHAT ARE POSTS HE ADDED BEFORE
				tcsHrMenu();
				
				break;
			case '2': 
				tcsdao.insertpost();//THIS METHOD IS FOR INSERTION OF NEW POSTS
				tcsHrMenu();
				
				break;
				
			case '3':
				System.out.println("delete post");
				tcsdao.deletepost();//THIS METHOD IS FOR DELETION OF  POSTS
				System.out.println("**********************Deletedpost Successfully***************");
				tcsHrMenu();
				break;
			case'4':
				System.out.println("update any job post");
				tcsdao.updatepost();//THIS METHOD IS TO UPDATE IN  POSTS
				System.out.println("**********************Updated Successfully***************");
				tcsHrMenu();
				break;
			case '5':
				
				tcs.Appliedtcs();//THIS METHOD IS FOR CHECKIG HOW MANY MEMBERS HAS BEEN APPLIED FOR THAT  POSTS
				tcsHrMenu();
				break;
			case '6':
				HRMenu.HRmainmenu();
				tcsHrMenu();
				break;
			case '7':
				System.out.println("******************thankyou*****************");
				break;
			}
			
	}


	public static void wiproHrMenu() throws SQLException, IOException {
		WIPROdao wiprodao = new WIPROdao();
		WIPRO wipro = new WIPRO();
		Scanner sc1= new Scanner(System.in);
		System.out.println("1.   VIEW POSTS");
		System.out.println("2.  Add a job post");
		System.out.println("3.  delete a job post");
		System.out.println("4.  update a job post");
		System.out.println("5.   applied list  ");
		System.out.println("6.    BACK  ");
		System.out.println("7.   Exit");
		Scanner in11 = new Scanner(System.in);
		char ch11 = in11.next().charAt(0);
		
		switch(ch11) {
		case '1':
		
			wiprodao.RetrieveHRwipro();
		wiproHrMenu();
			
			break;
		case '2': 
			wiprodao.insertpost();
			
			System.out.println("**********************Added Post Successfully***************");
			wiproHrMenu();
			
			break;
			
		case '3':
			System.out.println("delete post");
			wiprodao.deletepost();
			System.out.println("**********************Deletedpost Successfully***************");
			wiproHrMenu();
			break;
		case'4':
			System.out.println("update any job post");
			wiprodao.updatepost();
			System.out.println("**********************Updated Successfully***************");
			wiproHrMenu();
			break;
		case '5':
			wipro.Appliedwipro();
			wiproHrMenu();
			break;
		case '6':
		
			HRMenu.HRmainmenu();
			wiproHrMenu();
			break;
		case '7':
			
			System.out.println("******************thankyou*****************");
			break;
		}
		
	}
	public static void accentureHrMenu() throws SQLException, IOException {
		 ACCENTUREdao accenturedao = new ACCENTUREdao();
		 ACCENTURE accenture = new ACCENTURE();
		Scanner sc11= new Scanner(System.in);
		System.out.println("1.   VIEW POSTS");
		System.out.println("2.  Add a job post");
		System.out.println("3.  delete a job post");
		System.out.println("4.  update a job post");
		System.out.println("5.   applied list  ");
		System.out.println("6.    BACK  ");
		System.out.println("7.   Exit");
		Scanner in111 = new Scanner(System.in);
		char ch111 = in111.next().charAt(0);
		switch(ch111) {
		case '1':
		
		accenturedao.RetrieveHRaccenture();
		accentureHrMenu();
			
			break;
		case '2': 
			accenturedao.insertpost();
			
			System.out.println("**********************Added Post Successfully***************");
			accentureHrMenu();
			
			break;
			
		case '3':
			System.out.println("delete post");
			accenturedao.deletepost();
			System.out.println("**********************Deletedpost Successfully***************");
			accentureHrMenu();
			break;
		case'4':
			System.out.println("update any job post");
			accenturedao.updatepost();
			System.out.println("**********************Updated Successfully***************");
			accentureHrMenu();
			break;
		case '5':
			
			accenture.Appliedaccenture();
			accentureHrMenu();
			break;
		case '6':
			HRMenu.HRmainmenu();
			accentureHrMenu();
			break;
		case '7':
			
			System.out.println("******************thankyou*****************");
			break;
		}
	
		
		
	}
	public static void techmahindraHrMenu() throws SQLException, IOException {
		TECHMAHINDRAdao techmahindradao = new TECHMAHINDRAdao();
		TECHMAHINDRA techmahindra = new TECHMAHINDRA();
		Scanner sc111= new Scanner(System.in);
		System.out.println("1.   VIEW POSTS");
		System.out.println("2.  Add a job post");
		System.out.println("3.  delete a job post");
		System.out.println("4.  update a job post");
		System.out.println("5.   applied list  ");
		System.out.println("6.    BACK  ");
		System.out.println("7.   Exit");
		Scanner in1111 = new Scanner(System.in);
		char ch1111 = in1111.next().charAt(0);
		switch(ch1111) {
		case '1':
	
		techmahindradao.RetrieveHRtechmahindra();
		techmahindraHrMenu();
			
			break;
		case '2': 
			techmahindradao.insertpost();
			
			System.out.println("**********************Added Post Successfully***************");
			techmahindraHrMenu();
			break;
			
		case '3':
			System.out.println("delete post");
			techmahindradao.deletepost();
			System.out.println("**********************Deletedpost Successfully***************");
			tcsHrMenu();
			break;
		case'4':
			System.out.println("update any job post");
			techmahindradao.updatepost();
			System.out.println("**********************Updated Successfully***************");
			techmahindraHrMenu();
			break;
		case '5':
			
			techmahindra.Appliedtechmahindra();
			techmahindraHrMenu();
			break;
		case '6':
			HRMenu.HRmainmenu();
			techmahindraHrMenu();
			break;
		case '7':
			
			System.out.println("******************thankyou*****************");
			break;
		}
	
	}
		
	
	}
	
