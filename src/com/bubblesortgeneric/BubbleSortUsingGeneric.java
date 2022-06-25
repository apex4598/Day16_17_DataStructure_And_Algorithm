package com.bubblesortgeneric;

import java.util.Scanner;

public class BubbleSortUsingGeneric<B extends Comparable<B>> {

	public B[] SortingInAscendingOrder(B[] intArray) {

		int n = intArray.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				if ((intArray[j]).compareTo(intArray[j + 1])>0) {
					B temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}

	public B[] SortingInDescendingOrder(B[] intArray) {

		int n = intArray.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				if ((intArray[j]).compareTo(intArray[j + 1])<0) {
					B temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}

	public static void main(String[] args) {
		BubbleSortUsingGeneric bubbleSort = new BubbleSortUsingGeneric();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of integers to sort: ");
		int count = scanner.nextInt();

		Integer[] array = new Integer[count];

		System.out.print("Before sorting : ");
		for (int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
		}

		array = (Integer[]) bubbleSort.SortingInAscendingOrder(array);

		System.out.print("After sorting in ascending order : ");
		for (int element : array) {
			System.out.print(element + " ");
		}
		array = (Integer[]) bubbleSort.SortingInDescendingOrder(array);

		System.out.print("\n");
		System.out.print("After sorting in decending order : ");
		for (int element : array) {
			System.out.print(element + " ");
		}
		scanner.close();
	}
}
