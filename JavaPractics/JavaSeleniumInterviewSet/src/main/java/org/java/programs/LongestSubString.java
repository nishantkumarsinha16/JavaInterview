package org.java.programs;

import java.util.HashMap;
import java.util.Map;

import org.java.programs.ClassConcept.NestedClass;

public class LongestSubString {
	// Lonest Sub String without repeatation - Time Complexi-o(n)
	public static void main(String[] args) {
		longestStr("abcc");		
	}
	public static void longestStr(String s) {
		int n = s.length();
		int longest = 0, i = 0, j = 0;
		String subString = null;
Map<Character, Integer> map = new HashMap<Character, Integer>();
		while (j < n) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			map.put(s.charAt(j), j + 1);
			longest = Math.max(longest, j - i + 1);
			subString = map.keySet().toString();
			j = j + 1;
		}

		System.out.println("Sub String Length is: " + longest);
		System.out.println("Sub String is: " + subString);
	}
}
