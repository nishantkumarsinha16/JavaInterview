package org.java.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("nishant");
		al.add(123);

		Iterator it = al.iterator();
		while (it.hasNext()) {

			System.out.print(it.next());

		}

		/*
		 * Stream s=al.stream().map(e-> e); s.forEach(e->System.out.println(e));
		 */

	}

}
