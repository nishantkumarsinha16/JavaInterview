package org.java.programs;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxCountFromTextFile {
	public static void main(String[] args) throws IOException {
		String path = "./demo.txt";
		Map<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String currentLine = reader.readLine();

		while (currentLine != null) {
			String words[] = currentLine.toLowerCase().split(" ");
			for (String word : words) {
				if (!word.isBlank()) {
					if (map.containsKey(word)) {
						map.put(word, map.get(word) + 1);
					} else {
						map.put(word, 1);
					}
					}
			}
			currentLine = reader.readLine();
		}
		reader.close();
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		
		Map<String, Integer> count = new HashMap<String, Integer>();		
		map.entrySet().stream().
		filter(value -> value.getValue() == Collections.max(map.values()))
				.forEach(e -> count.put(e.getKey(), e.getValue()));
		System.out.println(count);

	}
}
