package com.findnumber;

import java.util.Scanner;

public class FindNumber {
	static Scanner scanner = new Scanner(System.in);

	public static int search(int low, int high) {
		if ((high - low) == 1)
			return low;
		int mid = low + (high - low) / 2;
		System.out.printf("Is it less than %d?  ", mid);
		System.out.println();
		System.out.println("Enter the true or false to find your number");
		boolean b = scanner.nextBoolean();
		if (b)
			return search(low, mid);
		else
			return search(mid, high);
	}
	public static void main(String[] args) {
		FindNumber questionFindNumber = new FindNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		int range = (int) Math.pow(2, number);
		System.out.printf("Think a number between 0 and range:", 0, number);
		int yourNumber = questionFindNumber.search(0, range);
		System.out.printf("Your guessing number is %d :", yourNumber);
		scanner.close();
	}
}
