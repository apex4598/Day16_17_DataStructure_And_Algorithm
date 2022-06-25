package com.insertionsort;

import java.util.Scanner;

public class InsertionSort {

	public static String[] insertSort(String[] array) {

		int i, temp;
		for (i = 1; i < array.length; i++) {
			String key = array[i];
			temp = i;

			while (temp > 0 && array[temp - 1].compareTo(key) > 0) {
				array[temp] = array[temp - 1];
				temp--;
			}
			array[temp] = key;
		}
		return array;
	}

	public static void printArray(String[] array) {
		System.out.println("\n" + "Sorted list :");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " " + "\n");
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of a string:");
		int sizeString = scanner.nextInt();

		String[] arrayString = new String[sizeString];
		int length = arrayString.length;
		System.out.println("Enter the list of elements to be Sorted:");

		for (int i = 0; i < length; i++) {
			arrayString[i] = scanner.next();
		}
		scanner.close();
		InsertionSort.insertSort(arrayString);
		InsertionSort.printArray(arrayString);
	}

}