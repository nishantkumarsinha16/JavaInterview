package org.java.programs;

public class LargestNumber {

	public static void main(String[] args) {

		int[] number = { 1, 2, 3, 4, 5,9 };

		for (int i = 0; i < number.length; i++) {

			for (int j = i + 1; j < number.length; j++) {
				if (number[i] < number[j]) {					
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;

				}
				

			}
		}
		System.out.println(number[0]);

	}

}
