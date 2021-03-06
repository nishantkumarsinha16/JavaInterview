package org.java.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShort {

	public static void main(String[] args) {

		String[] fruit = { "apple", "banana", "graphs", "chowimn", "donkey" };
		List<String> list = Arrays.asList(fruit);
		Collections.sort(list);
		// System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		// list.stream().filter(deal -> deal.equals("apple")).forEach(e ->
		// System.out.println(e));

		Integer[] num = { 9, 2, 3, 4, 5 };
		Arrays.sort(num);
		System.out.println("Acending order: " + Arrays.toString(num));
		System.out.println(num[0]);
		Arrays.sort(num, Collections.reverseOrder());
		System.out.println("Decending order: " + Arrays.toString(num));
		System.out.println(num[0]);

	}

}
