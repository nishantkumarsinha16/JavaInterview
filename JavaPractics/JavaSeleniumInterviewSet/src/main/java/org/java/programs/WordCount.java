package org.java.programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {

		String s = "nishant kumar sinha sinha";
		//s=s.replaceAll("//s", "");
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] arr = s.toLowerCase().split(" ");
		for (String word : arr) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}

		}
		map.forEach((k, v) -> System.out.println(k + " " + v));
		Map<String, Integer> count = new HashMap<String, Integer>();
		// Max count
		map.entrySet().stream().filter(value -> value.getValue() == Collections.max(map.values()))
				.forEach(e -> count.put(e.getKey(), e.getValue()));
		System.out.println(count);
	}

}
