package org.java.programs;

public class ReserveseString {
	static String s = "Selenium";

	public static void main(String[] args) {
		// String is inmuttable
		approchOne();
		approchTwo();

	}
	public static void approchOne() {
		String rev = "";
		int count = s.length();
		for (int i = count - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

	public static void approchTwo() {
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}
