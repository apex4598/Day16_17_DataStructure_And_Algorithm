package com.primenumber;

public class PrimeNum {
	public static void main(String[] args) {
		int startRange = 0;
		int endRange = 1000;
		System.out.println("Prime numbers are in between " + startRange + " and " + endRange + " is :");
		for (int range = startRange; range <= endRange; range++) {
			if (isPrime(range)) {
				System.out.println(range);
			}
		}
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / i; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}