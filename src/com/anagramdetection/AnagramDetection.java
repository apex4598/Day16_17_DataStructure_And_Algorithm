package com.anagramdetection;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	public boolean anagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] array1 = str1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = str2.toCharArray();
		Arrays.sort(array2);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first string :");
		String str1 = scanner.next();
		System.out.print("Enter second string :");
		String str2 = scanner.next();

		AnagramDetection anagramDetect = new AnagramDetection();

		if (anagramDetect.anagram(str1, str2)) {
			System.out.println("Strings are anagram.");
		} else {
			System.out.println("Strings are not anagram.");
		}
		scanner.close();
	}

}
