package org.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class NonReapeatedCharacter {

	public static void main(String[] args) {
		String input = "aabc";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				// break; // For First Non Repeating character
			}
		}
//		Optional<Entry<Character, Integer>> ma = map.entrySet()
//				.stream().filter(entry -> entry.getValue() == 1)
//				.findFirst();
		// .forEach(e -> System.out.println(e.getKey()));
//		System.out.println(ma);

	}
}
