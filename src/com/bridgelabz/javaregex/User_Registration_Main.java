/*@Purpose:: :As a User need to follow pre defined Password Rules
 *Rule1 -  minimum 8 Characters - NOTE � All rules must be passed
 *@File:: User Registration Using Regex
 *@Author:: Kishlay Kishan
 */

package com.bridgelabz.javaregex;

import java.util.Scanner;

public class User_Registration_Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {

			System.out.println("Enter 0 : Exit");
			System.out.println("Enter 1 : To validate First Name ");
			System.out.println("Enter 2 : To validate Last Name ");
			System.out.println("Enter 3 : To validate E-mail ");
			System.out.println("Enter 4 : To validate Moblie Number ");
			System.out.println("Enter 5 : To validate Password Rule 1 ");

			switch (scanner.nextInt()) {
			case 0:
				System.exit(0);

			case 1:
				User_Registration.validFirstName();
				break;

			case 2:
				User_Registration.validLastName();
				break;
			case 3:
				User_Registration.validEmail();
				break;

			case 4:
				User_Registration.validMobileNumber();
				break;

			case 5:
				User_Registration.validPassRule1();
				break;

			default:
				System.out.println("Select a valid number");
			}
		}
	}
}
