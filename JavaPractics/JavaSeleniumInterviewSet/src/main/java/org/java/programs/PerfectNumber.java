package org.java.programs;

public class PerfectNumber {
	public static void main(String[] args) {
		// positive divisior like-6 -- 1+2+3
		perfectNum(5);
	}

	public static void perfectNum(int num) {
		int sum = 0;
		if (num > 0) {
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}
			if (sum == num) {
				System.out.println("Yes");

			} else {
				System.out.println("No");

			}
		} else {
			System.out.println("Please enter positive number!");
		}

	}

}
