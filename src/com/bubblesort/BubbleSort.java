package com.bubblesort;

import java.util.Scanner;

public class BubbleSort {

	public int[] SortingInAscendingOrder(int[] intArray) {

		int n = intArray.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				if (intArray[j] > intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}

	public int[] SortingInDescendingOrder(int[] intArray) {

		int n = intArray.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				if (intArray[j] < intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of integers to sort: ");
		int count = scanner.nextInt();

		int[] array = new int[count];

		System.out.print("Before sorting : ");
		for (int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
		}

		array = bubbleSort.SortingInAscendingOrder(array);

		System.out.print("After sorting in ascending order : ");
		for (int element : array) {
			System.out.print(element + " ");
		}
		array = bubbleSort.SortingInDescendingOrder(array);

		System.out.print("\n");
		System.out.print("After sorting in decending order : ");
		for (int element : array) {
			System.out.print(element + " ");
		}
		scanner.close();
	}
}
