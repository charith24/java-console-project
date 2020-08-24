package dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import controller.Menu;
import model.LoginPojo;
import model.RegisterPojo;
import utility.UserDetails;

public class Login {
	static Userlogin ab = new Userlogin();
	static model.LoginPojo loginpojo = new LoginPojo();
	static UserDetails userdetail = new UserDetails();
	static RegisterPojo student = null;
	static RegisterPojo x =null;
	
	public static  void login(RegisterPojo test) throws ClassNotFoundException, SQLException, IOException {
		
		student = new RegisterPojo(test.getUsername(),test.getPassword());
	Userlogin.validate(student);
		if(ab.validate(student)==true) {
			System.out.println("*********************login Succesfull****************");
			
			Menu.options(userdetail.student(student));
			
		}
		else
			System.out.println("Incorrect Username/Password");
	}

}
