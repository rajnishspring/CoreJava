package com.interview.rsys;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Aman ");
		s.append("kumar");
		// System.out.println(s);

		System.out.println(s);
		String c = "rajnesh";
		c = c + "kumar";
		System.out.println(c); // s
		List<String> list=new ArrayList<String>();
		list.add("sachin");
		list.add("rajesh");
		list.add("ram");
		list.add("shyam");
		List l1 = list.stream().filter(l -> l.startsWith("s")).map(x -> x + 1).collect(Collectors.toList()); // l1.stream().forEach(System.out::println);
		l1.forEach(n -> System.err.println(n));

	}
}