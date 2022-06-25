package com.customizemessage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomizeMsgRegex {

	String firstName;
	String fullName;
	String contactNumber;
	String date;
	String message = "Hello <<name>>, We have your full " + "name as <<full name>> in our system. \nYour "
			+ "contact number is 91-xxxxxxxxxx." + " \nPlease,let us know in case of any"
			+ " clarification. \nThank you BridgeLabz 01/01/2016.";

	public static void main(String[] args) {

		CustomizeMsgRegex regex = new CustomizeMsgRegex();
		regex.start();
	}

	void start() {
		getUserInfo();
		replace("<<name>>", firstName);
		replace("<<full name>>", fullName);
		replace("xxxxxxxxxx", contactNumber);
		replace("01/01/2016", date);
		System.out.println(message);
	}

	void getUserInfo() {
		Scanner scanner = new Scanner(System.in); // scanner to get user input
		System.out.print("Enter your first name: ");
		firstName = scanner.nextLine();
		System.out.print("Enter your full name: ");
		fullName = scanner.nextLine();
		System.out.print("Enter your contact number: ");
		contactNumber = scanner.nextLine();
		System.out.print("Enter date in dd/mm/yyyy format: ");
		date = scanner.nextLine();
		scanner.close();
	}

	void replace(String stringToBeReplaced, String replacement) {
		Pattern pattern = Pattern.compile(stringToBeReplaced); // pattern
		Matcher matcher = pattern.matcher(message); // matcher
		message = matcher.replaceFirst(replacement);
	}
}
