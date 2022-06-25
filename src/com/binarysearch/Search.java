package com.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static Scanner scan = new Scanner(System.in);

	public static int binary(String[] array, String s) {
		int high = array.length - 1, low = 0, mid;
		Arrays.sort(array);

		while (low <= high) {
			mid = (high + low) / 2;
			if (s.equalsIgnoreCase(array[mid])) {
				return mid;
			} else if (array[mid].compareToIgnoreCase(s) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}
}