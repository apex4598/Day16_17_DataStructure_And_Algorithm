package com.mergesort;

import java.util.Scanner;

public class MergeSort<M extends Comparable<M>> {

	public static<M> M[] MergeSort(M[] list) {
		M[] sorted = (M[]) new String[list.length];
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length / 2;
			M[] left = null;
			M[] right = null;
			if ((list.length % 2) == 0) {
				left = (M[]) new String[list.length / 2];
				right = (M[]) new String[list.length / 2];
			} else {
				left = (M[]) new String[list.length / 2];
				right = (M[]) new String[(list.length / 2) + 1];
			}
			int x = 0;
			int y = 0;
			for (; x < mid; x++) {
				left[x] = list[x];
			}
			for (; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = MergeSort(left);
			right = MergeSort(right);
			sorted = mergeArray(left, right);
		}

		return sorted;
	}

	private static <M> M[] mergeArray(M[] left, M[] right) {
		M[] merged = (M[]) new String[left.length + right.length];
		int lIndex = 0;
		int rIndex = 0;
		int mIndex = 0;
		int comp = 0;
		while (lIndex < left.length || rIndex < right.length) {
			if (lIndex == left.length) {
				merged[mIndex++] = right[rIndex++];
			} else if (rIndex == right.length) {
				merged[mIndex++] = left[lIndex++];
			} else {
				comp = ((Comparable<M>) left[lIndex]).compareTo(right[rIndex]);
				if (comp > 0) {
					merged[mIndex++] = right[rIndex++];
				} else if (comp < 0) {
					merged[mIndex++] = left[lIndex++];
				} else {
					merged[mIndex++] = left[lIndex++];
				}
			}
		}
		return merged;
	}

	public static void main(String[] args) {
		MergeSort<String> mergeSort = new MergeSort<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of a string:");
		int strSize = sc.nextInt();
		String[] array = new String[strSize];

		int length = array.length;
		System.out.print("Enter the list of elements to be sorted :");
		for (int i = 0; i < length; i++) {
			array[i] = sc.next();
		}
		sc.close();
		String[] sortedArray = MergeSort(array);
		System.out.print("After sorting :");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}
}
