package controller;

import java.util.Scanner;

public class Apply {
	public static char details() {
		System.out.println("A.  apply");
		System.out.println("B.  BACK");
		System.out.println("========================================================");
		System.out.println("ENTER AN OPTION");
		System.out.println("========================================================");
		Scanner in = new Scanner(System.in);
		char ch = in.next().charAt(0);
		return ch;
	}
}
