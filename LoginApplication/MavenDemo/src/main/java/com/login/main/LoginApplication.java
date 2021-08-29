package com.login.main;

import java.util.Scanner;

import com.login.model.User;
import com.login.service.LoginService;
import com.login.service.LoginServiceImpl;

public class LoginApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter User Id");
		int id = scan.nextInt();
		System.out.println("Enter password");
		String pwd = scan.next();

		LoginService loginService = new LoginServiceImpl();

		User user = new User();
		user.setUserId(id);
		user.setPassword(pwd);
		User userObj = loginService.readByUserIdAndPassword(user);
		if (userObj != null) {
			System.out.println("Welcome " + user.getUserName());
		}

	}

}
