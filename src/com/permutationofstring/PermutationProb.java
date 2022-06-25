package com.permutationofstring;

import java.util.Scanner;

public class PermutationProb {

	public static void permutationOfString(String inputString, String result) {

		if (inputString.length() == 0) {
			System.out.println(result+ " ");
			return;
		}
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			String leftSubStr = inputString.substring(0, i);
			String rightSubStr = inputString.substring(i+1);
			String restSubStr = leftSubStr  + rightSubStr;
			permutationOfString(restSubStr, result + ch);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string you desire to permute : ");
		String inputString = scanner.next();
		System.out.println("Permutated string is :");
		permutationOfString(inputString, " ");
	}

}
