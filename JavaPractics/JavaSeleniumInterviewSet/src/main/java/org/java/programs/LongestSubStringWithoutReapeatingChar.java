package org.java.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutReapeatingChar {
	public static void main(String[] args) {
		longestSubString("aaabbbcccde");
	}
	public static void longestSubString(String s) {
		String subString = null;
		int length = 0;
		char[] arr = s.toCharArray();
Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
				}
			if (map.size() > length) {
				length = map.size();
				subString = map.keySet().toString();
			}
		}
		System.out.println("Size of SubString is: " + length);
		System.out.println("Sub String is: " + subString);
	}

}
