package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import model.RegisterPojo;
import utility.ConnectionManager;

public class Menu {
// THIS METHOD IS DISPLAYED WHEN  THE USER GETS LOGIN
			public static void options(RegisterPojo test) throws SQLException, IOException {
				
				Scanner in = new Scanner(System.in);
						System.out.println("\n");
						System.out.println("******************Welcome*********************");
						System.out.println("\n");
						System.out.println("\n");
				System.out.println("A.   Job Vacancies\nB.  Internships\nC.   Projects\nD.   EXIT");
				System.out.println("========================================================");
				System.out.println("ENTER AN OPTION");
				System.out.println("========================================================");

				Scanner in1 = new Scanner(System.in);
				char ch = in1.next().charAt(0);
				
				switch(ch) {
				case 'A':
					jobVacancies(test);
					break;
				case 'B':
					internships();
					break;
				case 'C':
					projects();
					break;
				case 'D':
					System.out.println("***************THANK YOU**************");
					break;
				default:
					System.out.println("Please enter valid choice");
					
				}
			}

			private static void projects( ) throws SQLException, IOException {
				
				System.out.println("A. MINI-PROJECTS\nB. JAVA-PROJECTS\nC.  MAJOR-ROJECTS\nD.  PYTHON-PROJECTS\nE. Back");
				System.out.println("========================================================");
				System.out.println("ENTER AN OPTION");
				System.out.println("========================================================");
				Scanner in = new Scanner(System.in);
				char ch2 = in.next().charAt(0);
				
				switch(ch2) {
				
				case 'E':
					Menu.options(null);
					break;
				default:
					System.out.println("Please enter valid choice");
					
				}
				
			}


			private static void internships( ) throws SQLException, IOException {
				
				System.out.println("A. FRONT-END INTERSHIP\nB. JAVA\nC.  WEB-DESIGN\nD.  PYTHON\nE. Back");
				System.out.println("========================================================");
				System.out.println("ENTER AN OPTION");
				System.out.println("========================================================");
				Scanner in = new Scanner(System.in);
				char ch1 = in.next().charAt(0);
				
				switch(ch1) {
				
				case 'E':
					Menu.options(null);
					break;
				default:
					System.out.println("Please enter valid choice");
				
				
			}
			}

		static void jobVacancies(RegisterPojo test) throws SQLException, IOException {
		
				System.out.println("A. TCS\nB. WIPRO\nC.  ACCENTURE\nD.  TECHMAHINDRA\nE. Back\nF. EXIT");
				Scanner in = new Scanner(System.in);
				char ch0 = in.next().charAt(0);
				
				switch(ch0) {
				case 'A':
					TCS tcs = new TCS();
					
					int x=tcs.Retrievetcs();
					if(x==1) {
						Connection con = ConnectionManager.getConnection();
						String sql = "INSERT INTO TCSAPPLIED(FIRSTNAME,LASTNAME,EMAIL,APPLIED)VALUES(?,?,?,?)";
						PreparedStatement st = con.prepareStatement(sql);
						st.setString(1,test.getFirstname());
						st.setString(2,test.getLastname());
						st.setString(3,test.getEmail());
						st.setString(4,"applied");
						st.executeUpdate();
						st.close();
					}
					Menu.jobVacancies(test);
					break;
				case 'B':
					WIPRO wipro = new WIPRO();
					
					int x1 = wipro.Retrievewipro();
					if(x1==1) {
						Connection con = ConnectionManager.getConnection();
						String sql = "INSERT INTO WIPROAPPLIED(FIRSTNAME,LASTNAME,EMAIL,APPLIED)VALUES(?,?,?,?)";
						PreparedStatement st = con.prepareStatement(sql);
						st.setString(1,test.getFirstname());
						st.setString(2,test.getLastname());
						st.setString(3,test.getEmail());
						st.setString(4,"applied");
						st.executeUpdate();
						st.close();
					}
					Menu.jobVacancies(test);
					break;
				case 'C':
					ACCENTURE accenture = new ACCENTURE();
					
					int x2 = accenture.Retrieveaccenture();
					if(x2==1) {
						Connection con = ConnectionManager.getConnection();
						String sql = "INSERT INTO ACCENTUREAPPLIED(FIRSTNAME,LASTNAME,EMAIL,APPLIED)VALUES(?,?,?,?)";
						PreparedStatement st = con.prepareStatement(sql);
						st.setString(1,test.getFirstname());
						st.setString(2,test.getLastname());
						st.setString(3,test.getEmail());
						st.setString(4,"applied");
						st.executeUpdate();
						st.close();
					}
					Menu.jobVacancies(test);
					break;
				case 'D':
						TECHMAHINDRA techmahindra = new TECHMAHINDRA();
						
						int x3 = techmahindra.Retrievetechmahindra();
						if(x3==1) {
							Connection con = ConnectionManager.getConnection();
							String sql = "INSERT INTO TECHMAHINDRAAPPLIED(FIRSTNAME,LASTNAME,EMAIL,APPLIED)VALUES(?,?,?,?)";
							PreparedStatement st = con.prepareStatement(sql);
							st.setString(1,test.getFirstname());
							st.setString(2,test.getLastname());
							st.setString(3,test.getEmail());
							st.setString(4,"applied");
							st.executeUpdate();
							st.close();
						}
						Menu.jobVacancies(test);
				
					break;
				case 'E':
					Menu.options(null);
					break;
				case 'F':
					System.out.println("*******************THANK YOU********************");
					break;
				default:
					System.out.println("Please enter valid choice");
				
					
				}
				
			}
	}

