package com.insertionsortgeneric;

import java.lang.reflect.Array;
import java.util.Scanner;

public class InsertionSortUsingGeneric<I> {

	public static <I extends Comparable<I>> I[] insertSort(I[] array) {

		int i, temp;
		for (i = 1; i < Array.getLength(null); i++) {
			I key = array[i];
			temp = i;

			while (temp > 0 && array[temp - 1].compareTo(key) > 0) {
				array[temp] = array[temp - 1];
				temp--;
			}
			array[temp] = key;
		}
		return array;
	}

	public static <I> void printArray(I[] array) {
		System.out.println("\n" + "Sorted list :");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " " + "\n");
	}

	public static void main(String[] args) {
		InsertionSortUsingGeneric insertionSort = new InsertionSortUsingGeneric();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of a string:");
		int sizeString = scanner.nextInt();

		String[] arrayString = new String[sizeString];
		int length = arrayString.length;
		System.out.println("Enter the list of elements to be sorted:");

		for (int i = 0; i < length; i++) {
			arrayString[i] = scanner.next();
		}
		scanner.close();
		InsertionSortUsingGeneric.insertSort(arrayString);
		InsertionSortUsingGeneric.printArray(arrayString);
	}

}
