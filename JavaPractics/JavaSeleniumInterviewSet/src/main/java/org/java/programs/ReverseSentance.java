package org.java.programs;

public class ReverseSentance {

	public static void main(String[] args) {

		String s = "my name is nishant";
		String rev = "";
		String[] arr = s.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			rev += arr[i] + " ";
		}
		System.out.println(rev);

	}

}
