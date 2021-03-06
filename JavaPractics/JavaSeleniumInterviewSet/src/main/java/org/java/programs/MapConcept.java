package org.java.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Nishant kumar");
		map.put(2, "Nishant kumar sinha");
		map.put(3, "Nishant sinha");

		for (Entry<Integer, String> s : map.entrySet()) {
			System.out.println(s.getKey()+" : "+s.getValue());

		}
		map.entrySet().stream().filter(e->e.getKey()==1).forEach(x->System.out.println(x));
		
		
		System.out.println();

		List<String> list = new LinkedList<String>();
		list.add("nishant");
		list.add("nishant");
		System.out.println(list);

		Set<String> se = new HashSet<String>();
		se.add("nishants");
		se.add("nishants");
		System.out.println(se);

	}

}
