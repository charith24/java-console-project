package controller;

import java.util.Scanner;

public class jobDetails {//THESE ARE THE COMPANY LIST DISPLAYED FOR THE USER 
	public static char details() {
		System.out.println("A.  TCS");
		System.out.println("B.  WIPRO");
		System.out.println("C.  ACCENTURE");
		System.out.println("D.  TECHMAHINDRA");
		System.out.println("E.  Back");
		System.out.println("F.  EXIT");
		System.out.println("========================================================");
		System.out.println("ENTER AN OPTION");
		System.out.println("========================================================");
		Scanner in = new Scanner(System.in);
		char ch = in.next().charAt(0);
		return ch;
	}
}